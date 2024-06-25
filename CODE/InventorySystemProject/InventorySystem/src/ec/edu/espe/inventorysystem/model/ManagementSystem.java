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

        do {
            System.out.println("\n--------------------");
            System.out.println("|      LOGIN       |");
            System.out.println("--------------------");
            System.out.println("Username:");

            String username = readUsername("Username");
            System.out.println("--------------------");
            System.out.println("Password:");
            String password = readPassword("Password");  
            
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

            if (!loggedIn) {
                System.err.println("Incorrect username or password. Please try again.");
            }

        } while (!loggedIn);

        System.out.println("\nWelcome!!\n");

        return loggedIn;
    }

    public void logout() {
        System.out.println("Leaving the system...");
        System.out.println("Goodbye, see later.");
    }
    
    public static String readPassword(String prompt) {
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = {prompt, passwordField};
        Object[] options = {"OK", "Cancelar"};
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int option = JOptionPane.showOptionDialog(frame, obj, "",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (option == JOptionPane.OK_OPTION) {
            char[] password = passwordField.getPassword();
            return new String(password) ;
            
        } else {
            return null;
        }
    }
    public static String readUsername(String prompt) {
        JTextField textField = new JTextField();
        Object[] obj = {prompt, textField};
        Object[] options = {"OK", "Cancelar"};
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        int option = JOptionPane.showOptionDialog(frame, obj, "",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (option == JOptionPane.OK_OPTION) {
            return textField.getText();
        } else {
            return null;
        }
    }

}
