//Write a Java program to remove all elements from a hash set.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program12 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("Hash_set Firts::-"+Hash_set);
        //to remove all elements from a hash set.
        Hash_set.removeAll(Hash_set);
        System.out.println("Removed All Elements:"+Hash_set);

    }
}

