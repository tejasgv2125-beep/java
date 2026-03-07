package dsa.collections.lambdaExpresion;

import java.util.ArrayList;
import java.util.Collections;

class Product{
    String name;
    int price;
    int quantity;

    public Product( String name,int price,int quantity) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Mobile",20000,10));
        products.add(new Product("Camera",45000,12));
        products.add(new Product("Laptop",55000,2));
        System.out.println("before sorting");
        for(Product p:products){
            System.out.println(p.name +","+p.price+","+p.quantity);
        }
        //💠Ascending
        Collections.sort(products,(p1,p2)->p1.quantity-p2.quantity);
        System.out.println("after sorting");
        for(Product p:products){
            System.out.println(p.name +","+p.price+","+p.quantity);
        }

        //💠Descending
        Collections.sort(products,(p1,p2)->p2.quantity-p1.quantity);
        System.out.println("after sorting");
        for(Product p:products){
            System.out.println(p.name +","+p.price+","+p.quantity);
        }

    }
}
