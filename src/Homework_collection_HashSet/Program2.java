//Write a Java program to iterate through all elements in a hash list.
package Homework_collection_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("To Display Electrical Hash_set:-"+Hash_set);
        //to iterate through all elements in a hash list
        Iterator<String> Demo=Hash_set.iterator();
        while (Demo.hasNext())
        {
            System.out.println(Demo.next());
        }
    }
}
