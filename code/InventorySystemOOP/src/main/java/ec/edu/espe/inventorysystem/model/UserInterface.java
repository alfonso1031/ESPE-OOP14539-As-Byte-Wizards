package ec.edu.espe.inventorysystem.model;

import java.util.Scanner;

/**
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    
    int option;

    public void displayMenu() {
        do {
            System.out.println("Inventory System Menu");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Update item");
            System.out.println("4. View all items");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            option = scanner.nextInt();
        
            switch (option) {
                case 1:
                    // Add product logic
                    break;
                case 2:
                    // Remove product logic
                    break;
                case 3:
                    // Update product logic
                    break;
                case 4:
                    // View all items logic
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