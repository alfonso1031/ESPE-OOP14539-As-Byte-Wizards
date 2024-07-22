
package ec.edu.espe.CraftStoreInventory.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.CraftStoreInventory.model.Product;
import ec.edu.espe.CraftStoreInventorySystem.view.FrmEditProduct;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;



public class CloudDB {

    private static MongoClient createMongoClient() {
        String connectionString = "mongodb+srv://ffalvarado:frank123@databsas.tuxhrit.mongodb.net/?appName=DatabsAs";

        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();

        return MongoClients.create(settings);
        
    }

    
   private MongoClient mongoClient;
    private MongoDatabase database;

    public CloudDB() {
        mongoClient = createMongoClient();
        database = mongoClient.getDatabase("CraftStoreDB");
    }
      public MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }
    public List<Document> getAllProducts() {
        MongoCollection<Document> collection = getCollection("product");
        List<Document> products = new ArrayList<>();
        try (var cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                products.add(cursor.next());
            }
        }
        return products;
    }

    public static void uploadProductlData(Product product) {
        try (MongoClient mongoClient = createMongoClient()) {
            MongoDatabase database = mongoClient.getDatabase("CraftStoreDB");

            saveProductToDatabase(product, database);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void saveProductToDatabase(Product product, MongoDatabase database) {
        MongoCollection<Document> collection = database.getCollection("product");

        Document productDocument = new Document("id", product.getId())
                .append("description", product.getDescription())
                .append("id", product.getId())
                .append("quantity", product.getQuantity())
                .append("name", product.getName())
                .append("category", product.getCategory())
                .append("price", product.getPrice())
                .append("size", product.getSize());

        try {
            collection.insertOne(productDocument);
            System.out.println("Product data saved successfully!");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }
    
    
    
}

