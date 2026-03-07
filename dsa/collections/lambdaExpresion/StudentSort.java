package dsa.collections.lambdaExpresion;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Alex"));
        list.add(new Student(2,"Bob"));
        list.add(new Student(3,"David"));
        System.out.println("before sorting");
        for (Student s: list){
            System.out.println(s.id+","+s.name);
        }
        //💠Ascending order based on id
        Collections.sort(list,(s1,s2)->s1.id-s2.id);
        System.out.println("after sorting");
        for (Student s: list){

            System.out.println(s.id+","+s.name);

        }//💠Descending Order
        Collections.sort(list,(s1,s2)->s2.id-s1.id);
        System.out.println("after sorting");
        for (Student s: list){

            System.out.println(s.id+","+s.name);
        }


    }
}
