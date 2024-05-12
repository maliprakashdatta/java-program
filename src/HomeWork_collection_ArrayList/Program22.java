//Write a Java program to print all the elements of an ArrayList using the elements' position.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program22 {
    public static void main(String[] args) {

        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("car");
        colorlist.add("Bike");
        colorlist.add("Tempo");
        System.out.println("ColorList:-"+colorlist);
        //print all the elements of an ArrayList using the elements' position.
        System.out.println("\nPrint using index of an element: ");
        int position = colorlist.size();
        for (int index = 0; index < position; index++) {
            System.out.println(colorlist.get(index));
        }
    }
}
