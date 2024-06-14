
package ec.edu.espe.inventorysystem.model;

import java.util.Scanner;

import utils.FileManager;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */


public  class Product { 
    private String id;
    private String name;
    private String description;
    private int quantity;
    private String category;
    private float price;
    private String size;
    Scanner scanner = new Scanner(System.in);


    public Product(String id, String name, String description, int quantity, String category, float price, String size) {
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
        int productCount = FileManager.countProducts();
        System.out.println("Total number of products: " + productCount);
    }

    public void addProduct(){
        System.out.print("Id: ");
        String id = scanner.nextLine();
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("description: ");
        String description = scanner.nextLine();
        System.out.print("quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("category: ");
        String category = scanner.nextLine();
        System.out.print("price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("size: ");
        String size = scanner.nextLine();

        FileManager.saveManagerProduct(id, name, description, quantity, category, price, size);

    }

    public void removeProduct(){
        System.out.print("Enter ID of the product to remove: ");
        String idToRemove = scanner.nextLine();
        FileManager.removeProduct(idToRemove);
    }


/*
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
*/
    @Override
    public String toString() {
        return "Product " + "id : " + getId() + " name: " + getName() + " description: " + getDescription() + " quantity: " + getQuantity() + " category :" + getCategory() + "  price :" + getPrice() + " size: " + getSize();
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
