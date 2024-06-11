
package ec.edu.espe.inventorysystem.view;


import ec.edu.espe.inventorysystem.model.ManagementSystem;
import ec.edu.espe.inventorysystem.model.UserInterface;


public class Main {

    public static void main(String[] args) {
   ManagementSystem userMana = new ManagementSystem();
     UserInterface userInt= new UserInterface();

     boolean out = false; 
                   do {            
             if (userMana.logIn()) {
                 
            userInt.displayMenu();  
        }else{
             System.out.println("Incorrect password");
         
            }
        } while (out);
            
   
        if (userMana.logIn()) {
            userInt.displayMenu(); 
        }else{
            System.out.println("Incorrect password");
        }

    }
}
