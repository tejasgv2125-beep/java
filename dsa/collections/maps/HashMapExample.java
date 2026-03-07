package dsa.collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
//        Map<String,String> hashMap=new HashMap<>();
//        //⭐here Map is the base level Interface
//        //we can use any class inside the hashMap interface
//
//        //ℹ️⭐⭐⭐ℹ️here Values can be duplicate,key should be unique
//        //💠To add the elements in the hashMap
//        hashMap.put("01","aaaa");
//        hashMap.put("03","bbbb");
//        hashMap.put("04","xxxx");
//        hashMap.put("02","yyyy");
//
//        //💠for Traversing throught the hashmap
//        for(Map.Entry<String,String> entry:hashMap.entrySet()){
//            //💠to print the key and value we use get keyword
//            System.out.println(entry.getKey()+","+entry.getValue());
//        }
//
//
//    }

        //⭐💠⭐For mainting the order we use the linkedHashMap

        Map<String, String> hashMap1 = new LinkedHashMap<>();
        //⭐here Map is the base level Interface
        //we can use any class inside the hashMap interface

        //ℹ️⭐⭐⭐ℹ️here Values can be duplicate,key should be unique
        //💠To add the elements in the hashMap
        hashMap1.put("01", "aaaa");
        hashMap1.put("03", "bbbb");
        hashMap1.put("04", "xxxx");
        hashMap1.put("02", "yyyy");

        //💠for Traversing throught the hashmap
        for (Map.Entry<String, String> entry : hashMap1.entrySet()) {
            //💠to print the key and value we use get keyword
            System.out.println(entry.getKey() + "," + entry.getValue());
        }


    }
}

