//Write a Java program to copy one array list into another.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program9 {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(3);
        Number.add(2);
        Number.add(5);
        Number.add(4);
        System.out.println("ArrayList Number:-"+Number);
        ArrayList<Integer> Number1=new ArrayList<>();
        Number1.add(10);
        Number1.add(20);
        Number1.add(30);
        Number1.add(40);
        System.out.println("ArrayList Number1:-"+Number1);
        // copy one array list into another.
        //Number to Number1
        Collections.copy(Number,Number1);
        System.out.println("Copy Number to Number1,\nAfter copy:");
        System.out.println("ArrayList Number: " + Number);
        System.out.println("ArrayList Number1: " + Number1);

    }
}
