package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ManagementSystem {

    private ArrayList<User> listUser;

    public ManagementSystem() {
        listUser = new ArrayList<>();
        listUser.add(new User("1", "admin", "admin", "PRO"));
        listUser.add(new User("2", "employee", "employee", "PRO"));
    }

    public boolean logIn() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (true) {
            System.out.println("\n--------------------");
            System.out.println("|      LOGIN       |");
            System.out.println("--------------------");
            
            System.out.println("Username:");
            String username = scanner.nextLine();
            
            if (username == null) {
                System.out.println("Login canceled.");
                System.exit(0);
            }

            System.out.println("--------------------");
            System.out.println("Password:");
            String password = scanner.nextLine();
            if (password == null) {
                System.out.println("Login canceled.");
                System.exit(0);
            }

            System.out.println("--------------------");

            try {
                for (User user : listUser) {
                    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                        loggedIn = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.err.println("An error occurred while logging in.");
                e.printStackTrace();
            }

            if (loggedIn) {
                System.out.println("\nWelcome!!\n");
                return true;
            } else {
                System.err.println("Incorrect username or password. Please try again.");
            }
        }
    }

    public void logout() {
        System.out.println("Leaving the system...");
        System.out.println("Goodbye, see later.");
    }

}

