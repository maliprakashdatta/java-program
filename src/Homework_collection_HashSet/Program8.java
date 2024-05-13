// Write a Java program to convert a hash set to a tree set.
package Homework_collection_HashSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
public class Program8 {
    public static void main(String[] args)
    {
        Set<String>  HST0TS= new HashSet<>();
        HST0TS.add("TV");
        HST0TS.add("Mobile");
        HST0TS.add("AC");
        HST0TS.add("Laptop");
        HST0TS.add("fan");
        System.out.println("Orignal HashSet is:- " + HST0TS);
        // Convert the HashSet to TreeSet
        Set<String> hashSetToTreeSet = new TreeSet<>(HST0TS);
        // Print the TreeSet
        System.out.println("Convert the HashSet to TreeSet: "+ hashSetToTreeSet);

    }
}
