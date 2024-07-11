package ec.edu.espe.inventorysystem.model;

import ec.edu.espe.inventorysystem.utils.JSONInvoiceManager;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


import ec.edu.espe.inventorysystem.utils.JSONProductManager;

/**
 * @author <As-Byte Wizards> DDCC ESPE
 */
public class UserInterface {

    int option = 0;

    Scanner scanner = new Scanner(System.in);
    ManagementSystem userMana = new ManagementSystem();
    Product product = new Product("", "", "", 0, "", 0, "size");
    
    public void displayMenuAdmin() throws ParseException {

        do {
            try {
                System.out.println("\n\n-----------------------------------");
                System.out.println("|      Inventory System Menu      |");
                System.out.println("-----------------------------------");
        
                System.out.println("|        [1] Add product          |");
                System.out.println("|        [2] Remove product       |");
                System.out.println("|        [3] Update product       |");
                System.out.println("|        [4] View all products    |");
                System.out.println("|        [5] Edit Quantity        |");
                System.out.println("|        [6] Change User          |");
                System.out.println("|        [7] Create Invoice       |");
                System.out.println("|        [8] Prinf Invoice        |");     
                System.out.println("|        [9] Delate Invoice       |");
                System.out.println("|        [10] Exit                 |\n");
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
                        JSONProductManager.readProducts();
                        break;
                    case 5:
                        product.editQuantity();
                        break;
                    case 6:
                        userMana.logIn();
                        break;
                    case 7:
                        JSONInvoiceManager.createInvoice();
                        break;
                    case 8:
                        JSONInvoiceManager.displayInvoiceList();
                        System.out.println("Enter the invoice number you want to view");
                        int numberInvoice = scanner.nextInt();
                        JSONInvoiceManager.viewInvoice(numberInvoice-1);
                        break;
                    case 9:
                        JSONInvoiceManager.displayInvoiceList();
                        System.out.println("Enter the invoice delate");
                        int numberInvoiceDelate = scanner.nextInt();
                        JSONInvoiceManager.deleteInvoice(numberInvoiceDelate-1);
   
                        break;
                    case 10:
                        userMana.logout();
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine();
            }
        } while (option!=10);
    }

}
