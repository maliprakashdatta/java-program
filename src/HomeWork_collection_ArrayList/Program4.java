//Write a Java program to retrieve an element (at a specified index) from a given array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        //retrieve an element
        String str=colorlist.get(0);
        System.out.println("retrieve an element:-"+str);

    }
}
