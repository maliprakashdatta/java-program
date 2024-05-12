//Write a Java program to clone a hash set to another hash set.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program6 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("To Display Electrical Hash_set:-"+Hash_set);
        // hash set to another hash set
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)Hash_set.clone();
        System.out.println("Cloned Hash Set: " + Hash_set);
    }
}
