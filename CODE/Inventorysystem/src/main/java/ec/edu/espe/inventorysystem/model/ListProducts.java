package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;

public class ListProducts {

    private ArrayList<Product> products;

    public ListProducts() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void viewProduct() {
        System.out.println("Personas ingresadas:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
