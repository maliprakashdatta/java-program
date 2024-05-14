//Write a Java program to test if a map contains a mapping for the specified key.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public record HashMapProgram7() {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //contains a mapping for the specified key
        System.out.println("contains a mapping for the specified key:-");
        if (hash.containsValue("BCA"))
        {
            System.out.println("is Contain " );
        }
        else {
            System.out.println("is NOT Contain");
        }
    }
}
