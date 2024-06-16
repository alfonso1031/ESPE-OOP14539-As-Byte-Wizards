package ec.edu.espe.inventorysystem.model;


import java.util.Scanner;
import utils.FileManager;

/**
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface{

    int option;
    static ListProducts listProdutc = new ListProducts();
    Scanner scanner = new Scanner(System.in);
    ManagementSystem userMana = new ManagementSystem() ;
    Product product = new Product("", "", "", 0, "", 0, "size");

    public void displayMenu() {

        do {
            System.out.println("\n\n|      Inventory System Menu      |");
            System.out.println("|        [1] Add product          |");
            System.out.println("|        [2] Remove product       |");
            System.out.println("|        [3] Update product       |");
            System.out.println("|        [4] View all products    |");
            System.out.println("|        [5] Count product        |");
            System.out.println("|        [6] Change User          |");
            System.out.println("|        [7] Exit                 |");
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
                    FileManager.editProduct();
                    break;
                case 4:
                    FileManager.readManager();
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
        } while (option != 7);
    }



    }
