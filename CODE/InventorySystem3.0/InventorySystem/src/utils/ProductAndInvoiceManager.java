package utils;

import ec.edu.espe.inventorysystem.model.Customer;
import ec.edu.espe.inventorysystem.model.Invoice;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProductAndInvoiceManager {

    public static void saveFile(String data, String fileName, String type) throws IOException {
        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
    }

    public static void saveManagerProduct(String id, String name, String description, int quantity, String category,float price, String size) {
        JSONParser parser = new JSONParser();
        JSONArray listProduct = new JSONArray();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            listProduct = (JSONArray) obj;
        } catch (IOException | ParseException e) {
        }

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

        listProduct.add(dateProduct);

        try (FileWriter file = new FileWriter("Product.json")) {
            file.write(listProduct.toJSONString());
            file.flush();
        } catch (IOException e) {
        }
    }

    public static void readManager() {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = jsonParser.parse(reader);

            if (obj == null) {
                System.out.println("Error: Product.json file is empty or contains invalid JSON.");
                return;
            }

            if (obj instanceof JSONArray listProduct) {

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
        } catch (IOException e) {
            System.out.println("Error reading Product.json file.");
        } catch (ParseException e) {
            System.out.println("Error parsing Product.json file: " + e.getMessage());
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

        try (FileReader reader = new FileReader("C:\\Users\\frank\\Desktop\\OPP\\ESPE-OOP14539-As-Byte-Wizards\\FILES\\Product.json")) {
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

    @SuppressWarnings("empty-statement")
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

      public static void createInvoice() {
        Scanner scanner = new Scanner(System.in);

        // Request customer information
        System.out.println("Enter customer information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Customer customer = new Customer(name, address, phone, email);

        // Read products from the JSON file
        JSONParser parser = new JSONParser();
        List<JSONObject> products = new ArrayList<>();
        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            JSONArray productList = (JSONArray) obj;

            // Display available products
            System.out.println("Available products:");
            int index = 1;
            for (Object productObj : productList) {
                JSONObject productWrapper = (JSONObject) productObj;
                JSONObject product = (JSONObject) productWrapper.get("product");
                if (product != null) {
                    System.out.println(index + ". " + product.get("name") + " - $" + product.get("price"));
                    products.add(productWrapper);
                    index++;
                }
            }
        } catch (IOException | ParseException e) {
            System.out.println("Error reading Product.json: " + e.getMessage());
        }

        // User selects products to purchase
        List<JSONObject> selectedProducts = new ArrayList<>();
        while (true) {
            System.out.print("Enter the product number to add to the invoice (or 'done' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int productIndex = Integer.parseInt(input) - 1;
                if (productIndex >= 0 && productIndex < products.size()) {
                    JSONObject selectedProductWrapper = (JSONObject) products.get(productIndex);
                    JSONObject selectedProduct = (JSONObject) selectedProductWrapper.get("product");
                    System.out.print("Enter the quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    selectedProduct.put("quantity", quantity);
                    selectedProducts.add(selectedProductWrapper);
                } else {
                    System.out.println("Invalid product number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        // Create the invoice
        Invoice invoice = new Invoice(customer, "2024-06-18", selectedProducts);

        // Save the invoice to a JSON file
        JSONObject invoiceJson = new JSONObject();
        invoiceJson.put("customer", customerToJson(customer));
        invoiceJson.put("date", invoice.getDate());
        invoiceJson.put("products", selectedProducts);

        try (FileWriter file = new FileWriter("Invoice.json")) {
            file.write(invoiceJson.toJSONString());
            file.flush();
            System.out.println("Invoice saved to Invoice.json");
        } catch (IOException e) {
            System.out.println("Error saving Invoice.json: " + e.getMessage());
        }
    }

    private static JSONObject customerToJson(Customer customer) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", customer.getName());
        jsonObject.put("address", customer.getAddress());
        jsonObject.put("phone", customer.getPhone());
        jsonObject.put("email", customer.getEmail());
        return jsonObject;
    }

    public static void printInvoice() {
        DecimalFormat df = new DecimalFormat("#.00");
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("Invoice.json")) {
            JSONObject invoiceJson = (JSONObject) parser.parse(reader);

            JSONObject customerJson = (JSONObject) invoiceJson.get("customer");
            String date = (String) invoiceJson.get("date");
            JSONArray productsJson = (JSONArray) invoiceJson.get("products");

            Customer customer = new Customer(
                (String) customerJson.get("name"),
                (String) customerJson.get("address"),
                (String) customerJson.get("phone"),
                (String) customerJson.get("email")
            );

            Invoice invoice = new Invoice(customer, date, productsJson);

            System.out.println("Invoice");
            System.out.println("Date: " + invoice.getDate());
            System.out.println("Customer:");
            System.out.println("  Name: " + invoice.getCustomer().getName());
            System.out.println("  Address: " + invoice.getCustomer().getAddress());
            System.out.println("  Phone: " + invoice.getCustomer().getPhone());
            System.out.println("  Email: " + invoice.getCustomer().getEmail());
            System.out.println("Products:");

            double subtotal = 0;
            double total = 0;
            double iva = 0;
            System.out.printf("%-10s %-10s %-10s %-15s %-25s %-15s %-15s\n", "Quantity", "Size", "Price", "Name", "Description", "ID", "Category");
            for (Object productObj : invoice.getProducts()) {
                JSONObject productWrapper = (JSONObject) productObj;
                JSONObject product = (JSONObject) productWrapper.get("product");
                if (product != null) {
                    long quantity = (long) product.get("quantity");
                    String size = (String) product.get("size");
                    double price = (double) product.get("price");
                    String name = (String) product.get("name");
                    String description = (String) product.get("description");
                    String id = (String) product.get("id");
                    String category = (String) product.get("category");

                    System.out.printf("%-10d %-10s %-10.2f %-15s %-25s %-15s %-15s\n",
                            quantity, size, price, name, description, id, category);
                    
                    
                    subtotal += price * quantity;
                    
                }
                
            }
            iva=subtotal * 0.15;
            total=subtotal+iva;
            System.out.println("Total parcial: $" + df.format(subtotal));
            System.out.println("Iva: $" + df.format(iva));
            System.out.println("Total: $" +  df.format(total));

        } catch (FileNotFoundException e) {
            System.out.println("Invoice.json file not found.");
        } catch (IOException e) {
            System.out.println("Error reading Invoice.json file.");
        } catch (ParseException e) {
            System.out.println("Error parsing Invoice.json file: " + e.getMessage());
        }
    }


    
}
