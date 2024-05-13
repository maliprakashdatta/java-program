//Write a Java program to compare two sets and retain elements that are the same.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program11 {
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("Fan");
        Hash_set.add("TV");
        Hash_set.add("Laptop");
        Hash_set.add("AC");
        Hash_set.add("Mobile");
        System.out.println("Hash_set Firts::-"+Hash_set);
        HashSet<String> set=new HashSet<>();
        set.add("Fan");
        set.add("Car");
        set.add("Laptop");
        set.add("tablefan");
        set.add("Mobile");
        System.out.println(" Hash_set Second:-"+Hash_set);
        //to compare two sets and retain elements that are the same
        Hash_set.retainAll(set);
        System.out.println("----To compare two sets and retain elements that are the same----- ");
        System.out.println( "Same Element Check :-"+Hash_set);

    }
}
