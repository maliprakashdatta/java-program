//Write a Java program to count the number of key-value (size) mappings in a map.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram2 {
    public static void main(String[] args) {


    HashMap<Integer, String> hash = new HashMap<Integer, String>();
    //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("Course name hash map:-" + hash);
        //Size of Hash Map
        System.out.println("----------------------------------------");
        System.out.println("count the number of key-value (size):-"+hash.size());

    }
}
