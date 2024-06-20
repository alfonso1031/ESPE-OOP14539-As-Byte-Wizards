
package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.List; 

/**
 *
 * @author <As-Byte Wizards> DDCC ESPE
 */
public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        getProducts().add(product);
    }

    public void removeProduct(Product product) {
        getProducts().remove(product);
    }

    public void findProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(name)) {
                System.out.println("Product found: " + product);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void lookInventory() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    @Override
    public String toString() {
        return "Inventory{" + "productList=" + getProducts() + '}';
    }

    /**
     * @return the productList
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products
     */
    public void setProductList(List<Product> products) {
        this.products = products;
    }
    
}

