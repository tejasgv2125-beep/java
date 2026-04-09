package dsa.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    public LRUCache(int capacity) {
        //the 'true' at the end is the magic ingredient
        //It tells the map to order items by access time
        //not insertion time
        super(capacity, 0.75f, true);//access order we can use for the order of the elements
        this.capacity = capacity;
    }
    /*💠This the nuilt in method in the linkedhash map
    we Override it to tell java exactly when a start
    kicking old items out
    */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        //if the size gets bigger than our capacity,return true
        //(kick the oldest out)
        return size() > capacity;
    }

    public static void main(String[] args) {
        //Lets build out 3-pair shoe rack
        LRUCache<String,String> shoeRack=new LRUCache<>(3);
        shoeRack.put("Monday","sneakers");
        shoeRack.put("Tuesday","boots");
        shoeRack.put("Wednesday","sandalsf");
        System.out.println("Rack Contents:"+shoeRack);

        //Now lets say we access the sneakers again on thursday
        //this makes the sneakers the most rescently used
        shoeRack.get("Monday");
        System.out.println("Rack Contents:"+shoeRack);

        //we buy a new Loafers and try to put them on the rack
        shoeRack.put("Thursday","Loafers");
        //lets see what got kicked out
        System.out.println("Rack after adding loafers:"+shoeRack);
        //We notice that boots have been kicked out,
        //because Sneakers were just accessed
    }
}
