package dsa.collections.sets;


import java.util.*;

public class LeaderBoard {
    public static void main(String[] args) {
        //ℹ️⭐⭐ℹ️Tree set always uses the ascending order
        Set<Integer> scores = new TreeSet<>();
        //💠for reversing the order we use
//        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        //💠to add the elemnts into the tree hashset
        scores.add(450);
        scores.add(125);
        scores.add(325);
        scores.add(100);
        scores.add(323);
        scores.add(111);
        System.out.println("leader board stats:"+scores);

    }
}
