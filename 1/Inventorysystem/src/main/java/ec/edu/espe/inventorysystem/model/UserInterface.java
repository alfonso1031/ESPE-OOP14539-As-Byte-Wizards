package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface {
    int option;
    ArrayList<Product> products = new ArrayList<>();
    private Product product;
    private Inventory inventory;
    
    Scanner scanner = new Scanner(System.in);
        
    public void displayMenu() {
        do {
            System.out.println("Inventory System Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. View all Products");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
        
            switch (option) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.removeProduct();
                    break;
                case 3:
                    product.updateProduct();
                    break;
                case 4:
                    product.viewAllProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
    }
}