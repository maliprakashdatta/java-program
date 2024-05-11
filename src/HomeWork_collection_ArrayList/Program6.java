//Write a Java program to remove the third element from an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program6 {
    public static void main(String[] args)
    {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        //remove the third element
        String rm=colorlist.remove(2);
        System.out.println("remove the third element:-"+rm);

   }
}
