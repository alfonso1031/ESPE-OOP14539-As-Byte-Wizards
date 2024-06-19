package ec.edu.espe.inventorysystem.utils;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ec.edu.espe.inventorysystem.model.*;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class BillManager {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String CUSTOMER_FILE_PATH = "customers.json";
    private static final String SALE_FILE_PATH = "sales.json";
    private static final String INVOICE_FILE_PATH = "invoices.json";

    // Métodos para la clase Customer
    public static List<Customer> readCustomersFromFile() throws IOException {
        File file = new File(CUSTOMER_FILE_PATH);
        return objectMapper.readValue(file, new TypeReference<List<Customer>>() {
        });
    }

    public static void writeCustomersToFile(List<Customer> customers) throws IOException {
        objectMapper.writeValue(new File(CUSTOMER_FILE_PATH), customers);
    }

    // Métodos para la clase Sale
    public static List<Sale> readSalesFromFile() throws IOException {
        File file = new File(SALE_FILE_PATH);
        return objectMapper.readValue(file, new TypeReference<List<Sale>>() {
        });
    }

    public static void writeSalesToFile(List<Sale> sales) throws IOException {
        objectMapper.writeValue(new File(SALE_FILE_PATH), sales);
    }

    // Métodos para la clase Invoice
    public static List<Invoice> readInvoicesFromFile() throws IOException {
        File file = new File(INVOICE_FILE_PATH);
        return objectMapper.readValue(file, new TypeReference<List<Invoice>>() {
        });
    }

    public static void writeInvoicesToFile(List<Invoice> invoices) throws IOException {
        objectMapper.writeValue(new File(INVOICE_FILE_PATH), invoices);
    }

}
