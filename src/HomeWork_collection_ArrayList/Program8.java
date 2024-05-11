//Write a Java program to sort a given array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program8 {
    public static void main(String[] args) {

        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(3);
        Number.add(2);
        Number.add(5);
        Number.add(4);
        System.out.println("Orignal ArrayList:-"+Number);
        //to sort a given array list
        Collections.sort(Number);
        System.out.println("To sorted a given array list"+Number);



    }
}
