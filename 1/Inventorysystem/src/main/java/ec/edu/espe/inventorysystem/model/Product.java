
package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Product {
    private ArrayList<String> id;
    private String name;
    private String description;
    private int quantity;
    private String category;
    private float price;
    private String size;
    
    public void calculateTotalSale(){
        float totalSale = getQuantity() * getPrice();
        System.out.println("Total sale: $" + totalSale);
    }

    public void checkTotalOfProducts(){
        System.out.println("Total number of products: " + getId().size());
    }

    public Product(ArrayList<String> id, String name, String description, int quantity, String category, float price, String size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + getId() + ", name=" + getName() + ", description=" + getDescription() + ", quantity=" + getQuantity() + ", category=" + getCategory() + ", price=" + getPrice() + ", size=" + getSize() + '}';
    }

    /**
     * @return the id
     */
    public ArrayList<String> getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ArrayList<String> id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
    
   
}
