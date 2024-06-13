
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
        listUser.add(new User("2","employee","employee", "PRO"));
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--------------------");
        System.out.println("|      LOGIN       |");
        System.out.println("--------------------");
        
        
        System.out.println("Username:");
        String user1 =scanner.nextLine();
        System.out.println("Password:");
        String password1= scanner.nextLine();  

        return user1.equals(listUser.get(0).getUsername()) && password1.equals(listUser.get(0).getPassword()); //esto cambiar tmb
}
    public boolean logout() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to go out? Write [YES] or [NO]");
        String yesOurnot = scanner.nextLine();
        boolean logout = true;
        
        if (yesOurnot == "yes"){
            return logout;
        } else {
            return logout = false;
        }
    }
}

       




