
package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Inventory {
    private List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        getProductList().add(product);
    }

    public void removeProduct() {
       
    }

    public void findProductById() {

    }

    public void findProductByName() {
        
    }

    public void updateInventory() {
        
    }

    @Override
    public String toString() {
        return "Inventory{" + "productList=" + getProductList() + '}';
    }

    /**
     * @return the productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
}

