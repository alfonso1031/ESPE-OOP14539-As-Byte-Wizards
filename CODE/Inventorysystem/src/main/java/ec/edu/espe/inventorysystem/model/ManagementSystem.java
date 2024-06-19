package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.Scanner;

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

        do {
            System.out.println("\n--------------------");
            System.out.println("|      LOGIN       |");
            System.out.println("--------------------");
            System.out.println("Username:");

            String username = scanner.nextLine();
            System.out.println("--------------------");
            System.out.println("Password:");
            String password = scanner.nextLine();
            System.out.println("--------------------");

            try {
                for (User user : listUser) {
                    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                        loggedIn = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("An error occurred while logging in.");
                e.printStackTrace();
            }

            if (!loggedIn) {
                System.out.println("Incorrect username or password. Please try again.");
            }

        } while (!loggedIn);

        System.out.println("\nWelcome!!\n");

        return loggedIn;
    }

    public void logout() {
        System.out.println("Leaving the system...");
    }
}
