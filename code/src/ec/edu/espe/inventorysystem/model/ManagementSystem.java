
package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class ManagementSystem {
    public static Object out;
    private String users;
    private Inventory inventory;
    private String sales;

    public ManagementSystem(String users, Inventory inventory, String sales) {
        this.users = users;
        this.inventory = inventory;
        this.sales = sales;
    }

    
    public void logIn() {

    }

    public void logOut() {
        
    }

    public void performBackup() {
        
    }

    public void loadData() {
        
    }

    @Override
    public String toString() {
        return "System{" + "users=" + getUsers() + ", inventory=" + getInventory() + ", sales=" + getSales() + '}';
    }

    /**
     * @return the users
     */
    public String getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(String users) {
        this.users = users;
    }

    /**
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the sales
     */
    public String getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(String sales) {
        this.sales = sales;
    }
    
}
