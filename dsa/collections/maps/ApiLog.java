package dsa.collections.maps;
//ℹ️⭐💠⭐ℹ️To maintain the insertion order we use linked hasmap
import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLog {
    public static void main(String[] args) {
        //ℹ️⭐⭐⭐ℹ️for building the api calls we use LinkedHash logs
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","Login");
        logs.put("4","Browse Videos");
        logs.put("3","Scroll up or scroll down");
        logs.put("5","LogOut");
        System.out.println("Api Logs"+logs);
    }

}
