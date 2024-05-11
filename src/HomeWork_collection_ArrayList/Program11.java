//Write a Java program to reverse elements in an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program11 {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);
        System.out.println("ArrayList Number:-"+Number);
        //tto reverse elements in an array list.
        Collections.reverse(Number);
        System.out.println("to reverse elements in an array list.:-"+Number);
    }
}
