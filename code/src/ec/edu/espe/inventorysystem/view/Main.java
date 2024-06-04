package ec.edu.espe.inventorysystem.view;

import ec.edu.espe.inventorysystem.model.Product;


/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product(1, "Fomix", "Azul", 10, "Liso", 20.0F, "Grande");
        product.toString();
    }
    
}
