
package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;
import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in);

    public Product(ArrayList<String> id, String name, String description, int quantity, String category, float price, String size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
        this.size = size;
    }
    public float calculateTotalSale(){
        float totalSale = getQuantity() * getPrice();
        System.out.println("Total sale: $" );
        return totalSale;
    }

    public void checkTotalOfProducts(){
        System.out.println("Total number of products: " + getId().size());
        }
        public void addProduct(){
        System.out.println("Adding product...");
        System.out.print("Enter ID: ");
        id.add(scanner.nextLine());
        
        System.out.print("Enter name: ");
        setName(scanner.nextLine());
        
        System.out.print("Enter description: ");
        setDescription(scanner.nextLine());
        
        System.out.print("Enter quantity: ");
        setQuantity(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Enter category: ");
        setCategory(scanner.nextLine());
        
        System.out.print("Enter price: ");
        setPrice(scanner.nextFloat());
        
        System.out.print("Enter size: ");
        setSize(scanner.nextLine());
        System.out.println("Product added successfully.");
        }	

        public void removeProduct(){
        System.out.println("Removing product...");
        System.out.print("Enter ID of the product to remove: ");
        String idToRemove = scanner.nextLine();
        for (int i = 0; i < getId().size(); i++) {
            if (getId().get(i).equals(idToRemove)) {
                getId().remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void updateProduct(){
        System.out.println("Updating product...");
        System.out.print("Enter ID of the product to update: ");
        String idToUpdate = scanner.nextLine();
        for (int i = 0; i < getId().size(); i++) {
            if (getId().get(i).equals(idToUpdate)) {
                System.out.print("Enter new ID: ");
                String newId = scanner.nextLine();
                getId().set(i, newId);
                
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                setName(newName);
                
                System.out.print("Enter new description: ");
                String newDescription = scanner.nextLine();
                setDescription(newDescription);
                
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                setQuantity(newQuantity);
                
                System.out.print("Enter new category: ");
                String newCategory = scanner.nextLine();
                setCategory(newCategory);
                
                System.out.print("Enter new price: ");
                float newPrice = scanner.nextFloat();
                setPrice(newPrice);
                
                System.out.print("Enter new size: ");
                String newSize = scanner.nextLine();
                setSize(newSize);
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }
    public void viewAllProducts(){
        System.out.println("Viewing all products...");
        for (int i = 0; i < getId().size(); i++) {
            System.out.println("Product " + (i + 1));
            System.out.println("ID: " + getId().get(i));
            System.out.println("Name: " + getName());
            System.out.println("Description: " + getDescription());
            System.out.println("Quantity: " + getQuantity());
            System.out.println("Category: " + getCategory());
            System.out.println("Price: " + getPrice());
            System.out.println("Size: " + getSize());
        }
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
