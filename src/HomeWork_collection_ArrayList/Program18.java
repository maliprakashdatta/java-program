//Write a Java program to test whether an array list is empty or not.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program18 {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);
        System.out.println("ArrayList Number:-"+Number);
        //to test whether an array list is empty or not
        Number.removeAll(Number);
        System.out.println("This is a empty  array list:"+Number);
        System.out.println("Checking the above array list is empty or not! "+Number.isEmpty());
    }
}
