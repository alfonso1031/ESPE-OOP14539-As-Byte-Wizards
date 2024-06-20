package ec.edu.espe.inventorysystem.model;


import java.util.List;
import org.json.simple.JSONObject;

public class Invoice {
    private Customer customer;
    private String date;
    private List<JSONObject> products;

  public Invoice(Customer customer, String date, List<JSONObject> products) {
        this.customer = customer;
        this.date = date;
        this.products = products;
    }
  

    // Getters and setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<JSONObject> getProducts() {
        return products;
    }

    public void setProducts(List<JSONObject> products) {
        this.products = products;
    }
    

    
    
}