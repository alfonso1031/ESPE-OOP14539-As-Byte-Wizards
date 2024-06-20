package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProductManager {

    private static ArrayList<JSONObject> productList = new ArrayList<>();

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

        System.out.println("Product saved. Current product quantities:");

    }

public static void readManager() {
    JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader("C:\\Users\\frank\\Desktop\\OPP\\ESPE-OOP14539-As-Byte-Wizards\\FILES\\Product.json")) {
        Object obj = jsonParser.parse(reader);

        if (obj == null) {
            System.out.println("Error: Product.json file is empty or contains invalid JSON.");
            return;
        }

        if (obj instanceof JSONArray) {
            JSONArray listProduct = (JSONArray) obj;

            if (listProduct.isEmpty()) {
                System.out.println("No products available.");
            } else {
                for (Object product : listProduct) {
                    viewManager((JSONObject) product);
                }
            }
        } else {
            System.out.println("Product.json does not contain a valid JSON array.");
        }

    } catch (FileNotFoundException e) {
        System.out.println("Product.json file not found.");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Error reading Product.json file.");
        e.printStackTrace();
    } catch (ParseException e) {
        System.out.println("Error parsing Product.json file: " + e.getMessage());
        e.printStackTrace();
    }
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

    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ID of the product you want to edit: ");
        String id = scanner.nextLine();

        JSONParser parser = new JSONParser();
        JSONArray listProduct = new JSONArray();
        boolean found = false;

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            listProduct = (JSONArray) obj;

            for (Object productObj : listProduct) {
                JSONObject product = (JSONObject) ((JSONObject) productObj).get("product");
                if (product.get("id").equals(id)) {
                    found = true;

                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter new description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter new quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter new price: ");
                    float price = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Enter new size: ");
                    String size = scanner.nextLine();

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
                try (FileWriter file = new FileWriter("Product.json")) {
                    file.write(listProduct.toJSONString());
                    file.flush();
                } catch (IOException e) {
                }
            }

        } catch (IOException | ParseException e) {
        }
    }

    public static void removeProduct(String id) {
        JSONParser parser = new JSONParser();
        JSONArray listProduct = new JSONArray();
        boolean found = false;

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            listProduct = (JSONArray) obj;

            found = listProduct.removeIf(productObj -> {
                JSONObject product = (JSONObject) ((JSONObject) productObj).get("product");
                return product.get("id").equals(id);
            });

            if (found) {
                try (FileWriter file = new FileWriter("Product.json")) {
                    file.write(listProduct.toJSONString());
                    file.flush();
                } catch (IOException e) {
                }
                System.out.println("Product has been removed.");
                System.out.println("Current product quantities:");

            } else {
                System.out.println("Product with ID " + id + " not found.");
            }

        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int countProducts() {
        JSONParser parser = new JSONParser();
        JSONArray listProduct = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            listProduct = (JSONArray) obj;
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());;
        }

        int count = listProduct.size();
        if (count == 0) {
            System.out.println("No products available.");
        }

        return count;
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



}
