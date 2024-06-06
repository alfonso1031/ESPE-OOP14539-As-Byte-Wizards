
package ec.edu.espe.inventorysystem.model;

import java.util.Scanner;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class ManagementSystem {
    private User user;

    public ManagementSystem(User user) {
        this.user = user;
    }
    
    public void logIn() {
        Scanner scanner = new Scanner(System.in);//falta el try catch
        System.out.println("Enter username: ");
        user.setUsername(scanner.nextLine());//cambiar cuando se implemente el username como arraylist
        System.out.println("Enter password: ");
        user.setPassword(scanner.nextLine());//esto tmb cambiar
        
        if (user.getUsername().equals(user.getUsername()) && user.getPassword().equals(user.getPassword())) {//esto cambiar tmb
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public void logOut() {
        user.setUsername(null);//cambiar cuando se implemente el username y password como arraylist
        user.setPassword(null);//esto tambien
        System.out.println("Logged out successfully!");
    }


    @Override
    public String toString() {
        return "ManagementSystem{" + "user=" + getUser() + '}';
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

   
}
