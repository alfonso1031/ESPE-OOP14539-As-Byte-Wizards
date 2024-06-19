package ec.edu.espe.inventorysystem.model;

import java.time.LocalDate;

class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private LocalDate registrationDate; 
    private String category;
    private float creditLimit; 

    public Customer(int id, String name, String address, String phone, String email, LocalDate registrationDate, String category, float creditLimit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.registrationDate = registrationDate;
        this.category = category;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + getId() + ", name=" + getName() + ", address=" + getAddress() + ", phone=" + getPhone() + ", email=" + getEmail() + ", registrationDate=" + getRegistrationDate() + ", category=" + getCategory() + ", creditLimit=" + getCreditLimit() + '}';
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
     * @return the registrationDate
     */
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the creditLimit
     */
    public float getCreditLimit() {
        return creditLimit;
    }

    /**
     * @param creditLimit the creditLimit to set
     */
    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }
    
}
