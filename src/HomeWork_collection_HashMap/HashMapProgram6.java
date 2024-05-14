// Write a Java program to get a shallow copy of a HashMap instance.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //To Clone Hash Map
        HashMap<Integer, String> Copy_HashMap = new HashMap<Integer, String>();

        Copy_HashMap=(HashMap)hash.clone();
        System.out.println("-------------------------------------------------");
        System.out.println("copy of a HashMap:-"+Copy_HashMap);
    }
}
