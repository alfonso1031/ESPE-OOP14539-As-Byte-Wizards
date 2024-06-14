
package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
import java.util.ArrayList;
import java.util.Date ;

public class Sale {
    private String id;
    private ArrayList<String> soldProductsList;
    private Date date;
    private double total;
    private float change;
    private Product product;

    public Sale(String id, ArrayList<String> soldProductsList, Date date, double total, float change) {
        this.id = id;
        this.soldProductsList = soldProductsList;
        this.date = date;
        this.total = total;
        this.change = change;
    }

    public float getChange() {
        float total= getProduct().calculateTotalSale()-getChange();
        return total;
    }


    @Override
    public String toString() {
        return "Sale{" + "id=" + id + ", soldProductsList=" + soldProductsList + ", date=" + date + ", total=" + getTotal() + ", change=" + change + '}';
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
     * @return the soldProductsList
     */
    public ArrayList<String> getSoldProductsList() {
        return soldProductsList;
    }

    /**
     * @param soldProductsList the soldProductsList to set
     */
    public void setSoldProductsList(ArrayList<String> soldProductsList) {
        this.soldProductsList = soldProductsList;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @param change the change to set
     */
    public void setChange(float change) {
        this.change = change;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    
    
}
