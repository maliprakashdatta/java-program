//Write a Java program to test if a hash set is empty or not.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program5 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("To Display Electrical Hash_set:-"+Hash_set);
        System.out.println("------------------------------------------------");
        //to test if a hash set is empty or not
        System.out.println("hash set is empty or not:-"+Hash_set.isEmpty());
        System.out.println("------------------------------------------------");
        Hash_set.removeAll(Hash_set);
        System.out.println("empty an hash set "+Hash_set);
    }
}

