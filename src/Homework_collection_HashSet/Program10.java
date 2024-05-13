//Write a Java program to compare two hash set.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program10 {
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
//to compare two hash set.
        HashSet<String> result_set = new HashSet<String>();
        for (String element : Hash_set)
        {
            System.out.println(set.contains(element) ? "Yes" : "No");
        }

    }
}
