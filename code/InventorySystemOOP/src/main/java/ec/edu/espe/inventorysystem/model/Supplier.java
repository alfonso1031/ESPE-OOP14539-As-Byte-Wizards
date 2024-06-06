
package ec.edu.espe.inventorysystem.model;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Supplier {
    private String id;
    private String name;
    private String contact;
    private String address;
    private String suppliedProductsList;

    public Supplier(String id, String name, String contact, String address, String suppliedProductsList) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.suppliedProductsList = suppliedProductsList;
    }

    public void updateInformation(String name, String contact, String address) {
        this.setName(name);
        this.setContact(contact);
        this.setAddress(address);
    }

    public void addSuppliedProduct() {
        
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + getId() + ", name=" + getName() + ", contact=" + getContact() + ", address=" + getAddress() + ", suppliedProductsList=" + getSuppliedProductsList() + '}';
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
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * @return the suppliedProductsList
     */
    public String getSuppliedProductsList() {
        return suppliedProductsList;
    }

    /**
     * @param suppliedProductsList the suppliedProductsList to set
     */
    public void setSuppliedProductsList(String suppliedProductsList) {
        this.suppliedProductsList = suppliedProductsList;
    }
    
}
