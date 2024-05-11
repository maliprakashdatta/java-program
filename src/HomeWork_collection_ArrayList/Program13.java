//Write a Java program to compare two array lists.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program13 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        ArrayList<String> colorlist1=new ArrayList<>();
        colorlist1.add("Grey");
        colorlist1.add("Teal");
        colorlist1.add("Maron");
        colorlist1.add("Yellow");
        colorlist1.add("Pink");
        System.out.println("ColorList:-"+colorlist);
        //to compare two array lists
        boolean boolval = colorlist.equals(colorlist1);
        //returns true because lists are equal
        System.out.println(boolval);
        //adding another element in the second list
        colorlist1.add("Grey");
         //again comparing both lists
        boolean bool = colorlist.equals(colorlist1);
        //returns false because lists are not equal
        System.out.println(bool);

    }
}
