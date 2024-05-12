//Write a Java program for trimming the capacity of an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program19 {
    public static void main(String[] args)
    {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        // trimming the capacity of an array list
        colorlist.trimToSize();
        System.out.println("trimming the capacity of an array list"+colorlist);
    }
}
