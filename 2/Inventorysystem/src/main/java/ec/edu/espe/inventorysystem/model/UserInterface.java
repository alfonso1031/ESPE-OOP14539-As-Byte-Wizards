package ec.edu.espe.inventorysystem.model;


import java.util.Scanner;
import utils.FileManager;

/**
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface {

    int option;
    static ListProducts listProdutc = new ListProducts();
    Scanner scanner = new Scanner(System.in);
    ManagementSystem userMana = new ManagementSystem();

    public void displayMenu() {

        do {
            System.out.println("|      Inventory System Menu    |");
            System.out.println("|         [1] Add item          |");
            System.out.println("|        [2] Remove item        |");
            System.out.println("|         [3]Update item        |");
            System.out.println("|        [4]View all items      |");
            System.out.println("|           [5]Exit             |");
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

                    FileManager.saveManagerProduct(id, name, description, quantity, category, price, size);

                    break;
                case 2:

                    break;
                case 3:
                    // Update product logic
                    break;
                case 4:
                    // View all items logic
                    FileManager.readManager();
                    break;
                case 5:
                    userMana.logout();

                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
    }



    }