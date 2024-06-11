
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
        String user1;
        String password1;
            ArrayList <User> listUser = new ArrayList <>();
            listUser.add(new User("1","admin","admin", "PRO"));
            listUser.add(new User("2","frank","frank123", "PRO"));
        
        Scanner scanner = new Scanner(System.in);//falta el try catch
        System.out.println("Enter username:");
        user1 =scanner.nextLine();//cambiar cuando se implemente el username como arraylist
        System.out.println("Enter password:");
        password1= scanner.nextLine();//esto tmb cambiar
        System.out.println(user1);
      
        return user1.equals(listUser.get(0).getUsername()) && password1.equals(listUser.get(0).getPassword()); //esto cambiar tmb
    }

   
}
