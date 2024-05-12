//Write a Java program to get the number of elements in a hash set.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program3 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("To Display Electrical Hash_set:-"+Hash_set);
        //to get the number of elements in a hash set
        System.out.println("number of elements in a hash set: " + Hash_set.size());
    }
}
