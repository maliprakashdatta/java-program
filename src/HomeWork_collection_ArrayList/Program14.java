// Write a Java program that swaps two elements in an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program14 {
    public static void main(String[] args) {

        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);

        // display Array List before swap
        System.out.println("----------------------------------------");
        System.out.println("Before Swap the ArrayList ");
        System.out.println(colorlist);

        // Swapping the elements at 0 and 4 indices
        Collections.swap(colorlist, 0, 4);
        System.out.println("-----------------------------------------");
        // display Array List after swap
        System.out.println("After Swap the ArrayList");
        System.out.println(colorlist);
    }

}
