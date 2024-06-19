
package ec.edu.espe.inventorysystem.model;


public class Customer {
    
    private String id;
    private String name;
    private String address ;
    private String email;
    private String phone;
    private String purchaseHistory;

    public Customer(String id, String name, String address, String email, String phone, String purchaseHistory) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone ; 
        this.purchaseHistory = purchaseHistory;
    }
    
    
        public void addPurchaseToHistory(String purchase) {
        this.purchaseHistory += purchase + ", ";
    }
    

     public void updateInformation(String name, String address, String email, String phone) {
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
        this.setPhone(phone);
    }
    
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone=" + phone + ", purchaseHistory=" + purchaseHistory + '}';
    }

    
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
    
    
    
    
    
    
    
    
}
