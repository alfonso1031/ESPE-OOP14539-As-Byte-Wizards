/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
import java.util.Date;
import java.util.List;

public class Sale {
    private String id;
    private String soldProductsList;
    private Date saleDate;
    private double totalSale;
    private Customer customer;
    private List<Double> appliedDiscounts;

    public Sale(String id, String soldProductsList, Date saleDate, double totalSale, Customer customer, List<Double> appliedDiscounts) {
        this.id = id;
        this.soldProductsList = soldProductsList;
        this.saleDate = saleDate;
        this.totalSale = totalSale;
        this.customer = customer;
        this.appliedDiscounts = appliedDiscounts;
    }

    public void calculateTotalSale() {
        
    }

    public void applyDiscount() {
        
    }

    public void registerSale() {

    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + getId() + ", soldProductsList=" + getSoldProductsList() + ", saleDate=" + getSaleDate() + ", totalSale=" + getTotalSale() + ", customer=" + getCustomer() + ", appliedDiscounts=" + getAppliedDiscounts() + '}';
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
    public String getSoldProductsList() {
        return soldProductsList;
    }

    /**
     * @param soldProductsList the soldProductsList to set
     */
    public void setSoldProductsList(String soldProductsList) {
        this.soldProductsList = soldProductsList;
    }

    /**
     * @return the saleDate
     */
    public Date getSaleDate() {
        return saleDate;
    }

    /**
     * @param saleDate the saleDate to set
     */
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * @return the totalSale
     */
    public double getTotalSale() {
        return totalSale;
    }

    /**
     * @param totalSale the totalSale to set
     */
    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
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
     * @return the appliedDiscounts
     */
    public List<Double> getAppliedDiscounts() {
        return appliedDiscounts;
    }

    /**
     * @param appliedDiscounts the appliedDiscounts to set
     */
    public void setAppliedDiscounts(List<Double> appliedDiscounts) {
        this.appliedDiscounts = appliedDiscounts;
    }
    
}