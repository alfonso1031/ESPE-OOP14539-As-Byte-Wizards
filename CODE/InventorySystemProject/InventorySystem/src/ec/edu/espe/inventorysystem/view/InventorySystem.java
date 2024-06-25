package ec.edu.espe.inventorysystem.view;

import ec.edu.espe.inventorysystem.model.ManagementSystem;
import ec.edu.espe.inventorysystem.model.UserInterface;
import org.json.simple.parser.ParseException;

public class InventorySystem {

    public static void main(String[] args) throws ParseException, java.text.ParseException {
        ManagementSystem userMana = new ManagementSystem();
        UserInterface userInt = new UserInterface();

        boolean out = false;
        do {
            if (userMana.logIn()) {

                userInt.displayMenuAdmin();
            } else {
                System.err.println("Incorrect password");
            }
        } while (out);

    }
}