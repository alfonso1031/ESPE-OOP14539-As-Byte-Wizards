package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author <As-Byte Wizards> DDCC ESPE
 */
import java.time.LocalDate;
import java.util.ArrayList;


public class Sale {
    private int id;
    private Customer customer; 
    private LocalDate date; 
    private ArrayList<Product> sellProduct; 
    private float totalAmount; 
    private String paymentMethod;
    private String shippingAddress;
    private String status;

    public Sale(int id, Customer customer, LocalDate date, ArrayList<Product> sellProduct, float totalAmount, String paymentMethod, String shippingAddress, String status) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.sellProduct = sellProduct;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
        this.status = status;
    }

    public void calculateTotalAmount() {
        float sum = 0;
        for (Product product : sellProduct) {
            sum += product.getPrice() * product.getQuantity(); 
        }
        this.totalAmount = sum;
    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + getId() + ", customer=" + getCustomer() + ", date=" + getDate() + ", sellProduct=" + getSellProduct() + ", totalAmount=" + getTotalAmount() + ", paymentMethod=" + getPaymentMethod() + ", shippingAddress=" + getShippingAddress() + ", status=" + getStatus() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the sellProduct
     */
    public ArrayList<Product> getSellProduct() {
        return sellProduct;
    }

    /**
     * @param sellProduct the sellProduct to set
     */
    public void setSellProduct(ArrayList<Product> sellProduct) {
        this.sellProduct = sellProduct;
    }

    /**
     * @return the totalAmount
     */
    public float getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the shippingAddress
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * @param shippingAddress the shippingAddress to set
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}