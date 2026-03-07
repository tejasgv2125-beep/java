package dsa.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTebleDemo {
    public static void main(String[] args) {
        //To print in the hashtable format
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"Sharanya");
        ht.put(117,"Shreyas");
        ht.put(128,"Sonika");
        ht.put(100,"Siri");
        ht.put(99,"Sunil");
        ht.put(101,"Prashanth");
        for(Map.Entry<Integer,String> entry:ht.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
