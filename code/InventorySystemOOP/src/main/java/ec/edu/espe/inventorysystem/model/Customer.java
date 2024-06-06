
package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
class Customer {
    private String id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String purchaseHistory;

    public Customer(String id, String name, String address, String email, String phone, String purchaseHistory) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.purchaseHistory = purchaseHistory;
    }

    public void updateInformation(String name, String address, String email, String phone) {
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
        this.setPhone(phone);
    }

    public void addPurchaseToHistory(String purchase) {
        this.purchaseHistory += purchase + ", ";
    }
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + getId() + ", name=" + getName() + ", address=" + getAddress() + ", email=" + getEmail() + ", phone=" + getPhone() + ", purchaseHistory=" + getPurchaseHistory() + '}';
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
     * @return the purchaseHistory
     */
    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    /**
     * @param purchaseHistory the purchaseHistory to set
     */
    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
    
}
