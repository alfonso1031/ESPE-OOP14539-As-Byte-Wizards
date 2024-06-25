package ec.edu.espe.inventorysystem.model;

import java.util.InputMismatchException;
import java.util.Scanner;

import ec.edu.espe.inventorysystem.utils.ProductAndInvoiceManager;

public class Product {

    private String id;
    private String name;
    private String description;
    private int quantity;
    private String category;
    private float price;
    private String size;
    Scanner scanner = new Scanner(System.in);

    public Product(String id, String name, String description, int quantity, String category, float price, String size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
        this.size = size;
    }

    public float calculateTotalSale() {
        float totalSale = getQuantity() * getPrice();
        System.out.println("Total sale: $" + totalSale);
        return totalSale;
    }

    public void checkTotalOfProducts() {
        int productCount = ProductAndInvoiceManager.countProducts();
        System.out.println("Total number of products: " + productCount);
    }

    public void addProduct() {
        try {
            System.out.print("Id: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Description: ");
            String description = scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();
            System.out.print("Price: ");
            float price = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("Size: ");
            String size = scanner.nextLine();

            ProductAndInvoiceManager.saveManagerProduct(id, name, description, quantity, category, price, size);
            System.out.println("Product Saved");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid digit.");
            scanner.nextLine();
        }
    }

    public void removeProduct() {
        System.out.print("Enter ID of the product to remove: ");
        String idToRemove = scanner.nextLine();
        ProductAndInvoiceManager.removeProduct(idToRemove);
    }

    public void editProduct() {
        try {
           ProductAndInvoiceManager.editProduct();
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid digit.");
            scanner.nextLine();
        }
    }

    @Override
    public String toString() {
        return "Product id: " + getId() + " name: " + getName() + " description: " + getDescription() + " quantity: " + getQuantity() + " category: " + getCategory() + " price: " + getPrice() + " size: " + getSize();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
