package ec.edu.espe.inventorysystem.model;


import java.util.Scanner;

/**
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface {
    int option;
    static ListProducts listProdutc = new ListProducts();
    Scanner scanner = new Scanner(System.in);
        
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
            System.out.print("Id: ");
            String id = scanner.nextLine();
            scanner.nextLine();
            System.out.print("name: ");
            String name = scanner.nextLine();
            System.out.print("description: ");
            String description = scanner.nextLine();
            System.out.print("quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.print("category: ");
            String category = scanner.nextLine();
            System.out.print("price: ");
            float price = scanner.nextFloat();
            scanner.nextLine();
            System.out.print("size: ");
            String size = scanner.nextLine();
            Product product = new Product(id, name, description,quantity, category, price, size);
            listProdutc.addProduct(product);
            break;
                case 2:
                   listProdutc.viewProduct();
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