package ec.edu.espe.inventorysystem.utils;

import ec.edu.espe.inventorysystem.model.Customer;
import ec.edu.espe.inventorysystem.model.Invoice;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceManager {

public static void createInvoice() {
    Scanner scanner = new Scanner(System.in);

    // Capturar información del cliente
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

    // Leer productos desde el archivo Product.json
    JSONParser parser = new JSONParser();
    JSONArray productList = new JSONArray();
    try (FileReader reader = new FileReader("Product.json")) {
        Object obj = parser.parse(reader);
        productList = (JSONArray) obj;
    } catch (IOException | ParseException e) {
        System.err.println("Error reading Product.json: " + e.getMessage());
    }

    List<JSONObject> selectedProducts = new ArrayList<>();
    double subtotal = 0;

    while (true) {
        System.out.println("Available products:");
        int index = 1;
        for (Object productObj : productList) {
            JSONObject productWrapper = (JSONObject) productObj;
            JSONObject product = (JSONObject) productWrapper.get("product");
            if (product != null) {
                System.out.println(index + ". " + product.get("Name") + " - $" + product.get("Price") + " (Quantity: " + product.get("Quantity") + ")");
                index++;
            }
        }
        System.out.print("Enter the product number to add to the invoice (or 'done' to finish): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("done")) {
            break;
        }

        try {
            int productIndex = Integer.parseInt(input) - 1;
            if (productIndex >= 0 && productIndex < productList.size()) {
                JSONObject selectedProductWrapper = (JSONObject) productList.get(productIndex);
                JSONObject selectedProduct = (JSONObject) selectedProductWrapper.get("product");
                System.out.print("Enter the quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());

                int availableQuantity = ((Long) selectedProduct.get("Quantity")).intValue();
                if (quantity > availableQuantity) {
                    System.out.println("Insufficient quantity for product: " + selectedProduct.get("Name"));
                } else {
                    // Crear una copia del producto seleccionado y ajustar la cantidad
                    JSONObject selectedProductCopy = new JSONObject();
                    selectedProductCopy.put("Name", selectedProduct.get("Name"));
                    selectedProductCopy.put("Description", selectedProduct.get("Description"));
                    selectedProductCopy.put("Quantity", quantity);
                    selectedProductCopy.put("Category", selectedProduct.get("Category"));
                    selectedProductCopy.put("Price", selectedProduct.get("Price"));
                    selectedProductCopy.put("Size", selectedProduct.get("Size"));
                    selectedProductCopy.put("Id", selectedProduct.get("Id"));

                    selectedProducts.add(selectedProductCopy);

                    // Actualizar la cantidad disponible en la lista de productos
                    selectedProduct.put("Quantity", availableQuantity - quantity);

                    // Calcular subtotal
                    double price = ((Number) selectedProduct.get("Price")).doubleValue();
                    subtotal += price * quantity;
                }
            } else {
                System.err.println("Invalid product number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    if (selectedProducts.isEmpty()) {
        System.err.println("No products selected for the invoice.");
        return;
    }

    // Calcular IVA y total
    double iva = subtotal * 0.15;
    double total = subtotal + iva;

    // Crear el objeto Invoice
    Invoice invoice = new Invoice(customer, "2024-06-18", selectedProducts);

    JSONObject invoiceJson = new JSONObject();
    invoiceJson.put("customer", customerToJson(customer));
    invoiceJson.put("date", invoice.getDate());
    invoiceJson.put("products", selectedProducts);
    invoiceJson.put("subtotal", subtotal);
    invoiceJson.put("iva", iva);
    invoiceJson.put("total", total);

    try (FileWriter file = new FileWriter("Invoice.json")) {
        file.write(invoiceJson.toJSONString());
        file.flush();
        System.out.println("Invoice saved to Invoice.json");
    } catch (IOException e) {
        System.err.println("Error saving Invoice.json: " + e.getMessage());
    }

    // Actualizar Product.json con las cantidades ajustadas
    try (FileWriter file = new FileWriter("Product.json")) {
        file.write(productList.toJSONString());
        file.flush();
        System.out.println("Product quantities updated in Product.json");
    } catch (IOException e) {
        System.err.println("Error updating Product.json: " + e.getMessage());
    }
}
public static void printInvoice() {
    DecimalFormat df = new DecimalFormat("#.00");
    JSONParser parser = new JSONParser();

    try (FileReader reader = new FileReader("Invoice.json")) {
        Object obj = parser.parse(reader);
        JSONObject invoiceJson = (JSONObject) obj;

        JSONObject customerJson = (JSONObject) invoiceJson.get("customer");
        String customerName = (String) customerJson.get("name");
        String customerAddress = (String) customerJson.get("address");
        String customerPhone = (String) customerJson.get("phone");
        String customerEmail = (String) customerJson.get("email");

        Customer customer = new Customer(customerName, customerAddress, customerPhone, customerEmail);

        String invoiceDate = (String) invoiceJson.get("date");
        JSONArray productsJson = (JSONArray) invoiceJson.get("products");

        System.out.println("Invoice");
        System.out.println("Date: " + invoiceDate);
        System.out.println("Customer:");
        System.out.println("  Name: " + customer.getName());
        System.out.println("  Address: " + customer.getAddress());
        System.out.println("  Phone: " + customer.getPhone());
        System.out.println("  Email: " + customer.getEmail());
        System.out.println("Products:");

        System.out.printf("%-10s %-10s %-10s %-15s %-25s %-15s %-15s\n",
                "Quantity", "Size", "Price", "Name", "Description", "ID", "Category");

        for (Object productObj : productsJson) {
            JSONObject product = (JSONObject) productObj;

            if (product != null) {
                String name = (String) product.get("Name");
                String description = (String) product.get("Description");
                String category = (String) product.get("Category");
                String id = (String) product.get("Id");
                String size = (String) product.get("Size");
                double price = ((Number) product.get("Price")).doubleValue();

                // Obtener cantidad vendida
                long quantity = ((Number) product.get("Quantity")).longValue();

                System.out.printf("%-10d %-10s $%-9.2f %-15s %-25s %-15s %-15s\n",
                        quantity, size, price, name, description, id, category);
            }
        }

        double subtotal = ((Number) invoiceJson.get("subtotal")).doubleValue();
        double iva = ((Number) invoiceJson.get("iva")).doubleValue();
        double total = ((Number) invoiceJson.get("total")).doubleValue();

        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("IVA (15%): $" + df.format(iva));
        System.out.println("Total: $" + df.format(total));

    } catch (IOException e) {
        System.err.println("Error reading Invoice.json file: " + e.getMessage());
    } catch (ParseException e) {
        System.err.println("Error parsing Invoice.json file: " + e.getMessage());
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

}
