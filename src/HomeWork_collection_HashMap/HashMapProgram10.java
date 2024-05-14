//Write a Java program to get the value of a specified key in a map.
package HomeWork_collection_HashMap;

import java.util.HashMap;

public class HashMapProgram10 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("UG Course name hash map:-" + hash);
        //get the value of a specified key
        String s1=hash.get(2);
        System.out.println("get the value of '2'a specified key:- "+s1);
    }
}
