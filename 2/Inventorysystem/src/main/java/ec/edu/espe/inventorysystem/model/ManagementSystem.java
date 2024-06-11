
package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class ManagementSystem {

    public ManagementSystem() {
    }
   

   
    
     public boolean logIn() {
        ArrayList<User> listUser = new ArrayList<>();
            listUser.add(new User("1","admin","admin", "PRO"));
            listUser.add(new User("2","frank","frank123", "PRO"));
        
        try (Scanner scanner = new Scanner(System.in) //falta el try catch
        ) {
            System.out.println("Enter username: ");
            String user1 = scanner.nextLine();
            
            System.out.println("Enter password: ");
            String password1 = scanner.nextLine();
            
            for (User user:listUser){
                if (user1.equals(user.getUsername()) && password1.equals(user.getPassword())){
                return true;    
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }


}
