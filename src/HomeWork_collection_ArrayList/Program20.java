//Write a Java program to increase an array list size
package HomeWork_collection_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class Program20 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("car");
        colorlist.add("Bike");
        colorlist.add("Tempo");
        System.out.println("ColorList:-"+colorlist);
        //to increase an array list size
        //Increase capacity to 8
        colorlist.ensureCapacity(8);
        colorlist.add("White");
        colorlist.add("Pink");
        colorlist.add("Yellow");
        colorlist.add("red");
        colorlist.add("Pink");
        System.out.println("New array list: " + colorlist);
    }
}
