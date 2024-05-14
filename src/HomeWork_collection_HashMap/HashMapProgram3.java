// Write a Java program to copy all mappings from the specified map to another map.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //Another hash Map
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash1.put(5, "MCA");
        hash1.put(6, "M.Sc");
        hash1.put(7, "M.Com");
        hash1.put(8, "MA");
        System.out.println("PG Course name hash1 map:-" + hash1);
        // specified map to another map
        hash1.putAll(hash);
        System.out.println("---------------------------------------------------------");
        System.out.println("Copy all mappings from the specified map to another:-"+hash1);
    }
}
