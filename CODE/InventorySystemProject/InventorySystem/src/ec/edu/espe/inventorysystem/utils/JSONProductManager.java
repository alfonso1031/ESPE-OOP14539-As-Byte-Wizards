package ec.edu.espe.inventorysystem.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Scanner;

public class JSONProductManager {

    public static void saveProduct(String id, String name, String description, int quantity, String category, float price, String size) {
        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;
        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
        }

        JSONObject product = new JSONObject();
        product.put("Id", id);
        product.put("Name", name);
        product.put("Description", description);
        product.put("Quantity", quantity);
        product.put("Category", category);
        product.put("Price", price);
        product.put("Size", size);

        JSONObject productWrapper = new JSONObject();
        productWrapper.put("product", product);

        productList.add(productWrapper);

        try (FileWriter file = new FileWriter("Product.json")) {
            file.write(productList.toJSONString());
            file.flush();
            System.out.println("Product saved to Product.json");
        } catch (IOException e) {
            System.err.println("Error saving Product.json: " + e.getMessage());
        }
    }

    public static void readProducts() {
        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;

            for (Object productObj : productList) {
                JSONObject productWrapper = (JSONObject) productObj;
                JSONObject product = (JSONObject) productWrapper.get("product");
                viewProduct(product);
            }
        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
        }
    }

    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ID of the product you want to edit: ");
        String id = scanner.nextLine();

        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();
        boolean found = false;

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;

            for (Object productObj : productList) {
                JSONObject productWrapper = (JSONObject) productObj;
                JSONObject product = (JSONObject) productWrapper.get("product");
                if (product.get("Id").equals(id)) {
                    found = true;

                    System.out.print("Enter new name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter new description: ");
                    String description = scanner.nextLine();

                    System.out.print("Enter new quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter new category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter new price: ");
                    float price = Float.parseFloat(scanner.nextLine());

                    System.out.print("Enter new size: ");
                    String size = scanner.nextLine();

                    product.put("Name", name);
                    product.put("Description", description);
                    product.put("Quantity", quantity);
                    product.put("Category", category);
                    product.put("Price", price);
                    product.put("Size", size);
                    System.out.println("Product edited");
                    break;
                }
            }

            if (!found) {
                System.err.println("Product with ID " + id + " not found.");
            } else {
                try (FileWriter file = new FileWriter("Product.json")) {
                    file.write(productList.toJSONString());
                    file.flush();
                    System.out.println("Product list updated in Product.json");
                } catch (IOException e) {
                    System.err.println("Error saving Product.json: " + e.getMessage());
                }
            }

        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
        }
    }

    public static void removeProduct(String id) {
        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();
        boolean found = false;

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;

            found = productList.removeIf(productObj -> {
                JSONObject product = (JSONObject) ((JSONObject) productObj).get("product");
                return product.get("Id").equals(id);
            });

            if (found) {
                try (FileWriter file = new FileWriter("Product.json")) {
                    file.write(productList.toJSONString());
                    file.flush();
                    System.out.println("Product with ID " + id + " has been removed.");
                    System.out.println("Updated product list:");
                    readProducts();
                } catch (IOException e) {
                    System.err.println("Error saving Product.json: " + e.getMessage());
                }
            } else {
                System.err.println("Product with ID " + id + " not found.");
            }

        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
        }
    }

    public static JSONObject getProductById(String id) {
        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;

            for (Object productObj : productList) {
                JSONObject productWrapper = (JSONObject) productObj;
                JSONObject product = (JSONObject) productWrapper.get("product");
                if (product.get("Id").equals(id)) {
                    return product;
                }
            }
        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
        }

        return null;
    }

    public static int getProductCount() {
        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;
        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
        }

        return productList.size();
    }
    
public void addQuantityToProduct(String productId, int quantityToAdd) {
        JSONParser parser = new JSONParser();
        JSONArray productList = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            productList = (JSONArray) obj;
        } catch (IOException | ParseException e) {
            System.err.println("Error reading Product.json: " + e.getMessage());
            return;
        }

        boolean found = false;

        for (Object productObj : productList) {
            JSONObject productWrapper = (JSONObject) productObj;
            JSONObject product = (JSONObject) productWrapper.get("product");

            if (product.get("Id").equals(productId)) {
                int currentQuantity = ((Long) product.get("Quantity")).intValue();
                int newQuantity = currentQuantity + quantityToAdd;
                product.put("Quantity", newQuantity);

                found = true;
                System.out.println("Quantity updated for product with ID " + productId + ". New quantity: " + newQuantity);
                break;
            }
        }

        if (!found) {
            System.err.println("Product with ID " + productId + " not found.");
        } else {
            try (FileWriter file = new FileWriter("Product.json")) {
                file.write(productList.toJSONString());
                file.flush();
                System.out.println("Product quantities updated in Product.json");
            } catch (IOException e) {
                System.err.println("Error updating Product.json: " + e.getMessage());
            }
        }
    }

    private static void viewProduct(JSONObject product) {
        String id = (String) product.get("Id");
        String name = (String) product.get("Name");
        String description = (String) product.get("Description");
        int quantity = ((Long) product.get("Quantity")).intValue();
        String category = (String) product.get("Category");
        float price = ((Number) product.get("Price")).floatValue();
        String size = (String) product.get("Size");

        System.out.println("--------------------------");
        System.out.println("|        Product         |");
        System.out.println("--------------------------");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Description : " + description);
        System.out.println("Category    : " + category);
        System.out.println("Price       : " + price);
        System.out.println("Size        : " + size);
        System.out.println("\nQuantity    : " + quantity);
    }
}
