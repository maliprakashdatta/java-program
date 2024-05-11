//Write a Java program to shuffle elements in an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);
        System.out.println("ArrayList Number:-"+Number);
        //to shuffle elements in an array list.
        Collections.shuffle(Number);
        System.out.println("to shuffle elements in an array list.:-"+Number);
    }
}
