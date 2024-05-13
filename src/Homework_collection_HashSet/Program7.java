//Write a Java program to convert a hash set to an array.
package Homework_collection_HashSet;

import java.util.HashSet;

public class Program7
{
    public static void main(String[] args) {
        HashSet<String> Hash_set=new HashSet<>();
        Hash_set.add("100");
        Hash_set.add("200");
        Hash_set.add("300");
        Hash_set.add("400");
        Hash_set.add("500");
        System.out.println("To Display Electrical Hash_set:-"+Hash_set);
        System.out.println("-------------------------------------------------");
        // to convert a hash set to an array.

        String array[] = new String[Hash_set.size()];
        int i=0;

        for(String str:Hash_set)
        {
            array[i++] = str;
        }

        for (String n : array)
            System.out.println("convert a hash set to an array :-"+n);
    }
}

