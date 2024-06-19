package ec.edu.espe.inventorysystem.model;

import java.util.InputMismatchException;
import java.util.Scanner;
import ec.edu.espe.inventorysystem.utils.ProductManager;

/**
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface {

    int option = 0;
    static ListProducts listProdutc = new ListProducts();
    Scanner scanner = new Scanner(System.in);
    ManagementSystem userMana = new ManagementSystem();
    Product product = new Product("", "", "", 0, "", 0, "size");

    public void displayMenu() {

        do {
            try {
                System.out.println("-----------------------------------");
                System.out.println("\n\n|      Inventory System Menu      |");
                System.out.println("-----------------------------------");
                System.out.println("|        [1] Add product          |");
                System.out.println("|        [2] Remove product       |");
                System.out.println("|        [3] Update product       |");
                System.out.println("|        [4] View all products    |");
                System.out.println("|        [5] Count product        |");
                System.out.println("|        [6] Change User          |");
                System.out.println("|        [7] Exit                 |");
                System.out.print("Enter your option: ");
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        product.addProduct();
                        break;
                    case 2:
                        product.removeProduct();
                        break;
                    case 3:
                        product.editProduct();
                        break;
                    case 4:
                        ProductManager.readManager();
                        break;
                    case 5:
                        product.checkTotalOfProducts();
                        break;
                    case 6:
                        userMana.logIn();
                        break;
                    case 7:
                        userMana.logout();
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer option.");
                scanner.nextLine();
            }
        } while (option != 7);
    }

}
