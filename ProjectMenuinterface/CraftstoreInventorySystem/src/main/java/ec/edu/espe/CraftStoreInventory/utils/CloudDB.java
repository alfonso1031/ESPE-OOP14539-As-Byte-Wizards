package ec.edu.espe.CraftStoreInventory.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import ec.edu.espe.CraftStoreInventory.model.Product;

import java.util.ArrayList;
import java.util.List;

public class CloudDB {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public CloudDB() {
        try {
            // Crear cliente de MongoDB
            String connectionString = "mongodb+srv://ffalvarado:frank123@databsas.tuxhrit.mongodb.net/?retryWrites=true&w=majority";
            ConnectionString connString = new ConnectionString(connectionString);

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                    .build();

            mongoClient = MongoClients.create(settings);
            database = mongoClient.getDatabase("CraftStoreDB");
            collection = database.getCollection("product"); // Inicializa la colección aquí

        } catch (MongoException e) {
            System.err.println("Error initializing MongoDB: " + e.getMessage());
        }
    }

    public void uploadProductData(Product product) {
        if (collection == null) {
            throw new IllegalStateException("MongoDB collection is not initialized.");
        }

        Document document = new Document("id", product.getId())
                .append("name", product.getName())
                .append("description", product.getDescription())
                .append("quantity", product.getQuantity())
                .append("size", product.getSize())
                .append("price", product.getPrice())
                .append("category", product.getCategory());

        try {
            collection.insertOne(document);
            System.out.println("Product data saved successfully!");
        } catch (MongoException e) {
            System.err.println("Error inserting document: " + e.getMessage());
        }
    }

    public boolean productExists(String id) {
        if (collection == null) {
            throw new IllegalStateException("MongoDB collection is not initialized.");
        }

        Document query = new Document("id", id);
        return collection.find(query).first() != null;
    }

    public void updateProduct(Product product) {
        if (collection == null) {
            throw new IllegalStateException("MongoDB collection is not initialized.");
        }

        Document query = new Document("id", product.getId());
        Document updatedData = new Document("$set", new Document()
                .append("name", product.getName())
                .append("description", product.getDescription())
                .append("quantity", product.getQuantity())
                .append("size", product.getSize())
                .append("price", product.getPrice())
                .append("category", product.getCategory()));

        try {
            collection.updateOne(query, updatedData);
            System.out.println("Product data updated successfully!");
        } catch (MongoException e) {
            System.err.println("Error updating document: " + e.getMessage());
        }
    }

    public List<Document> getAllProducts() {
        if (collection == null) {
            throw new IllegalStateException("MongoDB collection is not initialized.");
        }

        List<Document> products = new ArrayList<>();
        try (var cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                products.add(cursor.next());
            }
        } catch (MongoException e) {
            System.err.println("Error fetching documents: " + e.getMessage());
        }
        return products;
    }
 public MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }
    public void deleteProduct(String id) {
        
         MongoCollection<Document> collection = getCollection("product");
        Document query = new Document("id", id);

        try {
            var result = collection.deleteOne(query);
            if (result.getDeletedCount() > 0) {
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("No product found with the given ID.");
            }
        } catch (MongoException e) {
            System.err.println("Error deleting document: " + e.getMessage());
        }
        
    }
}
