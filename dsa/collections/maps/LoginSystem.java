package dsa.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("admin","admin@123");
        map.put("user1","pass1");
        map.put("user2","pass2");
        map.put("admin","admin@456");//update the pass
        System.out.println("Admin Pasword:"+map.get("admin"));
    }
}
