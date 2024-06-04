
package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
import java.util.Date;

public class Transaction {
    private String id;
    private String type;
    private Date date;
    private double amount;
    private User responsibleUser;

    public Transaction(String id, String type, Date date, double amount, User responsibleUser) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.amount = amount;
        this.responsibleUser = responsibleUser;
    }

    public void registerTransaction() {
        
    }

    public String getDetails() {
        return "ID: " + getId() + "\nType: " + getType() + "\nDate: " + getDate() + "\nAmount: " + getAmount() + "\nResponsible User: " + getResponsibleUser().getUsername();
    }

    @Override
    public String toString() {
        return "Transaction{" + "id=" + getId() + ", type=" + getType() + ", date=" + getDate() + ", amount=" + getAmount() + ", responsibleUser=" + getResponsibleUser() + '}';
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the responsibleUser
     */
    public User getResponsibleUser() {
        return responsibleUser;
    }

    /**
     * @param responsibleUser the responsibleUser to set
     */
    public void setResponsibleUser(User responsibleUser) {
        this.responsibleUser = responsibleUser;
    }
    
}
