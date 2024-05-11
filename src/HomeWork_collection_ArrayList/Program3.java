//Write a Java program to insert an element into the array list at the first position.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        //insert an element
        colorlist.add(0,"Red");
        System.out.println("insert an New element:"+colorlist);
    }
}
