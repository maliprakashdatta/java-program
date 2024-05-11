//Write a Java program to search for an element in an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program7
{
    public static void main(String[] args)
    {
    ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        if (colorlist.contains("Grey")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
