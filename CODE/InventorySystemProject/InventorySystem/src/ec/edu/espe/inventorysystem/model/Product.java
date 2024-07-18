package ec.edu.espe.inventorysystem.model;

import ec.edu.espe.inventorysystem.utils.JSONProductManager;
import java.util.InputMismatchException;
import java.util.Scanner;


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
        int productCount = JSONProductManager.getProductCount();
        System.out.println("Total number of products: " + productCount);
    }

     public  void addProduct() {
       
            System.out.print("Id: ");
            String id = readAlphanumericInput();

            System.out.print("Name: ");
            String name = readLettersWithSpacesInput();

            System.out.print("Description: ");
            String description = readLettersWithSpacesInput();

            System.out.print("Quantity: ");
            int quantity = readIntegerInput();
            scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Price: ");
            float price = readFloatInput();

            System.out.print("Size: ");
            String size = readNonEmptyStringInput();

            JSONProductManager.saveProduct(id, name, description, quantity, category, price, size);
            System.out.println("Product Saved");
       
    }
     private  String readAlphanumericInput() {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.matches("^[a-zA-Z0-9]+$")) {
                return input;
            } else {
                System.err.println("Invalid input. Please enter alphanumeric characters only.");
            }
        }
    }

    private  String readLettersWithSpacesInput() {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.matches("^[a-zA-Z ]+$")) {
                return input;
            } else {
                System.err.println("Invalid input. Please enter letters and spaces only.");
            }
        }
    }

    private  int readIntegerInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter an integer.");
                scanner.nextLine();  // Limpiar el búfer del escáner
            }
        }
    }

private float readFloatInput() {
    while (true) {
        try {
            String input = scanner.nextLine().trim();
            float price = Float.parseFloat(input);
            if (price <= 0) {
                System.err.println("Price must be greater than zero.");
            } else {
                return price;
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid float number for price.");
        }
    }
}

    private  String readNonEmptyStringInput() {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.err.println("Input cannot be empty. Please enter again.");
            }
        }
    }


    public void removeProduct() {
        System.out.print("Enter ID of the product to remove: ");
        String idToRemove = scanner.nextLine();
        JSONProductManager.removeProduct(idToRemove);
    }

    public void editProduct() {
        try {
           JSONProductManager.editProduct();
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid digit.");
            scanner.nextLine();
        }
    }
    
     public void editQuantity() {
        Scanner scanner = new Scanner(System.in);
        JSONProductManager productManager = new JSONProductManager();
        
        try {
            System.out.print("Enter product ID to add quantity: ");
            String productId = scanner.nextLine();

            System.out.print("Enter quantity to add: ");
            int quantityToAdd = Integer.parseInt(scanner.nextLine());

            productManager.addQuantityToProduct(productId, quantityToAdd);
        } catch (NumberFormatException e) {
            System.err.println("Error: Please enter a valid number for quantity.");
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
