// Write a Java program to iterate through all elements in an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program2
{
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        for (String list:colorlist)
        System.out.println("ColorList:-"+list);

    }
}
