//Write a Java program to join two array lists.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program15 {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(2);
        Number.add(3);
        Number.add(4);
        Number.add(5);
        System.out.println("ArrayList Number:-"+Number);
        ArrayList<Integer> Number1=new ArrayList<>();
        Number1.add(100);
        Number1.add(200);
        Number1.add(300);
        Number1.add(400);
        System.out.println("ArrayList Number1:-"+Number1);
        //to join two array lists
        ArrayList<Integer>  num= new ArrayList<>();
        num.addAll(Number);
        num.addAll(Number1);
        System.out.println("----------------------------------------------------------");
        System.out.println("join two array lists " + num);

    }
}
