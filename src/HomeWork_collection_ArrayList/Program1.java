//Write a Java program to create an array list, add some colors (strings) and print out the collection.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);

    }
}
