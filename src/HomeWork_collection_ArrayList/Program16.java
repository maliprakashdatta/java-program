//Write a Java program to clone an array list to another array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program16 {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);
        System.out.println("ArrayList Number:-"+Number);
        //to clone an array list to another array list
        ArrayList<Integer> newc1 = (ArrayList<Integer>)Number.clone();
        System.out.println("Cloned array list: " + newc1);

    }
}
