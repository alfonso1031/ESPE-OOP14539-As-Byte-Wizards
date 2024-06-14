/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.inventorysystem.model;

import java.util.Date ;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Invoice {
    private Customer customer;
    private String id;
    private Date date;
    private Sale sale;
    private Product product;

    public Invoice(Customer customer, String id, Date date, Sale sale, Product product) {
        this.customer = customer;
        this.id = id;
        this.date = date;
        this.sale = sale;
        this.product = product;
    }
    
    public void displayCustomerInformation(){
        System.out.println("Customer information: ");
        System.out.println("Name: " + getCustomer().getName());
        System.out.println("ID: " + getCustomer().getId());
        System.out.println("Address: " + getCustomer().getAddress());
        System.out.println("Phone: " + getCustomer().getPhone());        
    }

    public void displayProductInformation(){
        System.out.println("Product information: ");
        System.out.println("ID: " + getProduct().getId());
        System.out.println("Name: " + getProduct().getName());
        System.out.println("Description: " + getProduct().getDescription());
        System.out.println("Quantity: " + getProduct().getQuantity());
        System.out.println("Category: " + getProduct().getCategory());
        System.out.println("Price: " + getProduct().getPrice());
        System.out.println("Size: " + getProduct().getSize());
    }

    public void displaySaleInformation(){
        System.out.println("Sale information: ");
        System.out.println("ID: " + getSale().getId());
        System.out.println("Sold products list: " + getSale().getSoldProductsList());
        System.out.println("Date: " + getSale().getDate());
        System.out.println("Total: " + getSale().getTotal());
        System.out.println("Change: " + getSale().getChange());
    }
    
    @Override
    public String toString() {
        return "Invoice{" + "customer=" + getCustomer() + ", id=" + getId() + ", date=" + getDate() + ", sale=" + getSale() + '}';
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
     * @return the sale
     */
    public Sale getSale() {
        return sale;
    }

    /**
     * @param sale the sale to set
     */
    public void setSale(Sale sale) {
        this.sale = sale;
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
