//Write a Java program to empty an hash set.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program4 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("To Display Electrical Hash_set:-"+Hash_set);
        //to empty an hash set.
        Hash_set.removeAll(Hash_set);
        System.out.println("empty an hash set "+Hash_set);
    }
}
