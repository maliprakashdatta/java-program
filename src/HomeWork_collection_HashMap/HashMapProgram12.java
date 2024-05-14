//Write a Java program to get a collection view of the values contained in this map.
package HomeWork_collection_HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapProgram12 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
         //get a collection view of the values
        System.out.println("Key set values are: " +hash.values());
    }
}
