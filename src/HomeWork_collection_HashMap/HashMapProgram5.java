// Write a Java program to check whether a map contains key-value mappings (empty) or not.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //Check the empty) or not.
        //hash.isEmpty();
        System.out.println("HashMap is (empty) To display False othe wise True:"+hash.isEmpty());
    }
}
