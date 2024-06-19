package ec.edu.espe.inventorysystem.utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProductManager {

    private static ArrayList<JSONObject> productList = new ArrayList<>();

    static {
        loadProductsFromFile();
    }

    public static void saveFile(String data, String fileName, String type) throws IOException {
        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
    }

    public static void saveManagerProduct(String id, String name, String description, int quantity, String category,
            float price, String size) {
        boolean productExists = false;

        for (JSONObject productObj : productList) {
            JSONObject product = (JSONObject) productObj.get("product");
            if (product.get("id").equals(id)) {
                int currentQuantity = ((Long) product.get("quantity")).intValue();
                product.put("quantity", currentQuantity + quantity);
                productExists = true;
                break;
            }
        }

        if (!productExists) {
            JSONObject products = new JSONObject();
            products.put("id", id);
            products.put("name", name);
            products.put("description", description);
            products.put("quantity", quantity);
            products.put("category", category);
            products.put("price", price);
            products.put("size", size);

            JSONObject dateProduct = new JSONObject();
            dateProduct.put("product", products);

            productList.add(dateProduct);
        }

        saveProductsToFile();
        System.out.println("Product saved. Current product quantities:");
        displayProductQuantities();
    }

    public static void readManager() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (JSONObject product : productList) {
            viewManager(product);
        }
        System.out.println("Current product quantities:");
        displayProductQuantities();
    }

    public static void viewManager(JSONObject jsonObject) {
        JSONObject product = (JSONObject) jsonObject.get("product");

        long quantity = (long) product.get("quantity");
        String size = (String) product.get("size");
        double price = (double) product.get("price");
        String name = (String) product.get("name");
        String description = (String) product.get("description");
        String id = (String) product.get("id");
        String category = (String) product.get("category");

        System.out.println("--------------------------");
        System.out.println("|        Product         |");
        System.out.println("--------------------------");
        System.out.println("ID          :" + id);
        System.out.println("Name        : " + name);
        System.out.println("Description :" + description);
        System.out.println("Category    :" + category);
        System.out.println("Price       :" + price);
        System.out.println("Size        :" + size);
        System.out.println("Quantity    :" + quantity);
    }

    public static void editProduct(String id, String name, String description, int quantity, String category,
            float price, String size) {
        boolean found = false;

        for (JSONObject productObj : productList) {
            JSONObject product = (JSONObject) productObj.get("product");
            if (product.get("id").equals(id)) {
                found = true;
                product.put("name", name);
                product.put("description", description);
                product.put("quantity", quantity);
                product.put("category", category);
                product.put("price", price);
                product.put("size", size);
                break;
            }
        }

        if (!found) {
            System.out.println("Product with ID " + id + " not found.");
        } else {
            saveProductsToFile();
            System.out.println("Product edited. Current product quantities:");
            displayProductQuantities();
        }
    }

    public static void removeProduct(String id) {
        boolean found = productList.removeIf(productObj -> {
            JSONObject product = (JSONObject) productObj.get("product");
            return product.get("id").equals(id);
        });

        if (found) {
            saveProductsToFile();
            System.out.println("Product has been removed. Current product quantities:");
            displayProductQuantities();
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public static int countProducts() {
        return productList.size();
    }

    private static void loadProductsFromFile() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            JSONArray listProduct = (JSONArray) obj;
            productList = new ArrayList<>(listProduct);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static void saveProductsToFile() {
        try (FileWriter file = new FileWriter("Product.json")) {
            JSONArray listProduct = new JSONArray();
            listProduct.addAll(productList);
            file.write(listProduct.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayProductQuantities() {
        for (JSONObject productObj : productList) {
            JSONObject product = (JSONObject) productObj.get("product");
            String id = (String) product.get("id");
            String name = (String) product.get("name");
            long quantity = (long) product.get("quantity");
            System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity);
        }
    }
}
