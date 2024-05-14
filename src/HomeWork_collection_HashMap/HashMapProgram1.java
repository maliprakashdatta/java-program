//Write a Java program to associate the specified value with the specified key in a HashMap.
package HomeWork_collection_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        //Enter UG Corse Name
        hash.put(1, "BCA");
        hash.put(2, "B.Sc");
        hash.put(3, "B.Com");
        hash.put(4, "BA");
        System.out.println("Course name hash map:-" + hash);
        for (Map.Entry HM : hash.entrySet())
        {
            System.out.println("specified value with the specified key:-"+HM.getKey() + " " + HM.getValue());
        }
    }

}
