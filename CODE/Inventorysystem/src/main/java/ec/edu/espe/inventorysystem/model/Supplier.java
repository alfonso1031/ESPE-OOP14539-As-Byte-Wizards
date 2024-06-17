/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.inventorysystem.model;

import java.util.Scanner;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Supplier {
    private String id;
    private String name;
    private String contact;
    private String suppliedProductsList;
    private String address;
    Scanner scanner = new Scanner(System.in);

    public Supplier(String id, String name, String contact, String suppliedProductsList, String address) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.suppliedProductsList = suppliedProductsList;
        this.address = address;
    }
    
    public void updateInformation(){
        System.out.println("UPDATING SUPPLIER INFORMATION...");
        System.out.print("ENTER NEW ID: ");
        String newId = scanner.nextLine();
        setId(newId);
        
        System.out.print("ENTER NEW NAME: ");
        String newName = scanner.nextLine();
        setName(newName);
        
        System.out.print("ENTER NEW CONTACT: ");
        String newContact = scanner.nextLine();
        setContact(newContact);
        
        System.out.print("ENTER NEW SUPPLIED PRODUCTS LIST: ");
        String newSuppliedProductsList = scanner.nextLine();
        setSuppliedProductsList(newSuppliedProductsList);
        
        System.out.print("ENTER NEW ADDRESS: ");
        String newAddress = scanner.nextLine();
        setAddress(newAddress);
        System.out.println("SUPPLIER INFORMATION UPDATED SUCCESSFULLY.");
    }
    
    @Override
    public String toString() {
        return "Supplier{" + "id=" + getId() + ", name=" + getName() + ", contact=" + getContact() + ", suppliedProductsList=" + getSuppliedProductsList() + ", address=" + getAddress() + '}';
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
    
    
}
