package ec.edu.espe.inventorysystem.model;

import java.time.LocalDate;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Invoice {
    private int id;
    private Sale sale; 
    private LocalDate date; 
    private LocalDate dueDate; 
    private float amountDue; 
    private String status;
    private String paymentMethod;

    public Invoice(int id, Sale sale, LocalDate date, LocalDate dueDate, float amountDue, String status, String paymentMethod) {
        this.id = id;
        this.sale = sale;
        this.date = date;
        this.dueDate = dueDate;
        this.amountDue = amountDue;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public void calculateAmountDue() {
        this.amountDue = sale.getTotalAmount(); 
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + getId() + ", sale=" + getSale() + ", date=" + getDate() + ", dueDate=" + getDueDate() + ", amountDue=" + getAmountDue() + ", status=" + getStatus() + ", paymentMethod=" + getPaymentMethod() + '}';
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
     * @return the dueDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the amountDue
     */
    public float getAmountDue() {
        return amountDue;
    }

    /**
     * @param amountDue the amountDue to set
     */
    public void setAmountDue(float amountDue) {
        this.amountDue = amountDue;
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
    
     
}