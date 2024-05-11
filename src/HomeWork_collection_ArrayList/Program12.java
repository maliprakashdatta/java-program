// Write a Java program to extract a portion of an array list.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Program12
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
        //o extract a portion of an array list.  //Error  and Some Problem
        //ava.util.List<java.lang.String> cannot be converted to java.util.ArrayList<java.lang.String>
       // ArrayList<String> sub_List=
        colorlist.subList(0,2);
        System.out.println("List of first three elements: " + colorlist);

    }
}