//Write a Java program to remove all mappings from a map.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //remove all mappings from a map
        hash.clear();
        System.out.println("remove all mappings from a map:-"+hash);
    }
}
