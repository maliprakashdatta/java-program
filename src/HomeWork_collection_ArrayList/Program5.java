//Write a Java program to update an array element by the given element.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        //pdate an array element
        colorlist.set(0,"White");
        System.out.println("Update an array element:-"+colorlist);
    }
}
