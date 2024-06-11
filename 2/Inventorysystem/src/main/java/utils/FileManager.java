
package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileManager {
 
      public static void saveFile(String data, String fileName, String type) throws IOException {

        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }

        
    }

      
         public static void saveManagerProduct(String id, String name, String description, int quantity, String category, float price, String size) {
        JSONParser parser = new JSONParser();
        JSONArray listProduct = new JSONArray();
        
        try (FileReader reader = new FileReader("Product.json")) {
            Object obj = parser.parse(reader);
            listProduct = (JSONArray) obj;
        } catch (IOException | ParseException e) {
        }

        JSONObject products = new JSONObject();
        products.put("id", id);
        products.put("name", name);
        products.put("description", description);
        products.put("quantity", quantity);
        products.put("category", category);
        products.put("price", price);
        products.put("size", size);

        JSONObject dateProduct = new JSONObject();
        dateProduct.put("product", products);

        listProduct.add(dateProduct);

        try (FileWriter file = new FileWriter("Product.json")) {
            file.write(listProduct.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
         
        public static void readManager(){
    
        JSONParser jsonParser = new JSONParser();
    
        try (FileReader reader = new FileReader("Product.json") ){
            Object obj = jsonParser.parse(reader);
                JSONArray listProduct = (JSONArray)obj;
            
            
            for(Object product: listProduct){viewManager((JSONObject) product );}
           
            
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
        e.printStackTrace();
        } catch (ParseException e){
        e.printStackTrace();
        }
        

        
    }
         public static void viewManager(JSONObject jsonObject) {
        
        JSONObject product = (JSONObject) jsonObject.get("product");
    
        long quantity =(long)product.get("quantity");
        String size=(String)product.get("size");
        double price=(double)product.get("price");
        String name=(String) product.get("name");
        String description=(String)product.get("description");
        String id=(String) product.get("id");
        String category=(String)product.get("category");
             System.out.println("--------------------------");
             System.out.println("|        Produtc          |");
             System.out.println("--------------------------");
             System.out.println("ID          :"+ id);
             System.out.println("Name        : "+ name);
             System.out.println("Description :"+description);
             System.out.println("Category    :"+category);
             System.out.println("Price       :"+price);
             System.out.println("Size        :"+size);
             System.out.println("Quantity    :"+quantity);
    }
    
    
      
      
      
      
      
      
}