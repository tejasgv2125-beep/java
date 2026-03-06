package dsa.collections.sets;
import java.util.*;
public class MaintainInsertionOrder {
    public static void main(String[] args) {
        //ℹ️in hash there is no insertion order
        //👆 to solve this we use linked HashSet
        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(13);
        set.add(24);
        set.add(35);
        System.out.println(set);
    }
}
