package ec.edu.espe.inventorysystem.model;

import java.util.ArrayList;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Supplier {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private ArrayList<String> productsSupplied; 
    private String paymentTerms;
    private String deliveryTerms;

    public Supplier(int id, String name, String address, String phone, String email, ArrayList<String> productsSupplied, String paymentTerms, String deliveryTerms) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.productsSupplied = productsSupplied;
        this.paymentTerms = paymentTerms;
        this.deliveryTerms = deliveryTerms;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + getId() + ", name=" + getName() + ", address=" + getAddress() + ", phone=" + getPhone() + ", email=" + getEmail() + ", productsSupplied=" + getProductsSupplied() + ", paymentTerms=" + getPaymentTerms() + ", deliveryTerms=" + getDeliveryTerms() + '}';
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the productsSupplied
     */
    public ArrayList<String> getProductsSupplied() {
        return productsSupplied;
    }

    /**
     * @param productsSupplied the productsSupplied to set
     */
    public void setProductsSupplied(ArrayList<String> productsSupplied) {
        this.productsSupplied = productsSupplied;
    }

    /**
     * @return the paymentTerms
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * @param paymentTerms the paymentTerms to set
     */
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * @return the deliveryTerms
     */
    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * @param deliveryTerms the deliveryTerms to set
     */
    public void setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }
    
    
    

}