
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


public class FileManagr {
 
      public static void saveFile(String data, String fileName, String type) throws IOException {

        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
        
        
        
        
    }
      public static int calculateAge(LocalDate bornOnDate ){
          LocalDate today = LocalDate.now();
         return Period.between(bornOnDate, today).getYears();

}
      
         public static void saveManager(String id,String name,String address,String email,String phone,String purchaseHistory)throws IOException{

   
    JSONObject customer = new JSONObject();
    customer.put("id", id);
    customer.put("name", name);
    customer.put("address", address);
    customer.put("email", email);
    customer.put("phone", phone);
    customer.put("purchaseHistory", purchaseHistory);
    
    
    JSONObject dateCustomer = new JSONObject();
    dateCustomer.put("customer", customer);
    JSONArray listCustomer = new JSONArray();
    listCustomer.add(dateCustomer);
    
         try(FileWriter file = new FileWriter("customer.json")){
             file.write(listCustomer.toJSONString());
             file.flush();
             
         } catch (IOException e) {
             e.printStackTrace();
         }
    
    }
         
        private static void readManager(){
    
    JSONParser jsonParser = new JSONParser();
    
        try (FileReader reader = new FileReader("customer.json") ){
            Object obj = jsonParser.parse(reader);
                JSONArray listCustomer = (JSONArray)obj;
            
            System.out.println(listCustomer);
            for(Object customer: listCustomer){viewManager((JSONObject) customer );}
           
            
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
        e.printStackTrace();
        } catch (ParseException e){
        e.printStackTrace();
        }
        

        
    }
         private static void viewManager(JSONObject jsonObject) {
        
        JSONObject customer = (JSONObject) jsonObject.get("customer");
        
        System.out.println("Customer");
        String id=(String) customer.get("id");
        System.out.println(id);
        String name=(String) customer.get("name");
        System.out.println(name);
        String address=(String)customer.get("address");
        System.out.println(address);
        String email=(String)customer.get("email");
        System.out.println(email);
        String phone=(String)customer.get("phone");
        System.out.println(phone);
        String purchaseHistory=(String)customer.get("purchaseHistory");
        System.out.println(phone);
    
 
    }
    
    
      
      
      
      
      
      
}