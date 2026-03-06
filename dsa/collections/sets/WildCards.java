package dsa.collections.sets;
import java.util.*;
public class WildCards {
    public static void printList(List<?> list) {
        //ℹ️⭐⭐ℹ️ when we are using ? we can add any  datatype of the elemnt in the lisy
        for (Object o : list) {//because there are diff datatype
            System.out.print(o + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        printList(strings);
        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        printList(integer);
    }
}
/*
ℹ️WildCard
it is the generic datatype
it can handle anyth
we should use always object to print it
*/