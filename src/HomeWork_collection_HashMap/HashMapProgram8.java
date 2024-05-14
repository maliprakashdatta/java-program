//Write a Java program to test if a map contains a mapping for the specified value.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram8 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //contains a mapping for the specified Value
        System.out.println("Is the Value 'BCA' present? " + hash.containsValue("BCA"));
        // Checking for the Value_element 'MCA'
        System.out.println("Is the Value 'MCA' present? " +
                hash.containsValue("MCA"));
}
}
