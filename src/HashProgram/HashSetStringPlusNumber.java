// Java program to illustrate HashMap class
// of java.util package

// Importing Has
import java.util.HashMap;

public class HashSetStringPlusNumber
{

    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Prakash", 33);
        map.put("sachin", 34);
        map.put("vaibhav", 20);
        System.out.println("Size of map is:- " + map.size());
        System.out.println(map);
        if (map.containsKey("Prakash"))
          {
            Integer a = map.get("Prakash");
            System.out.println("value for key" + " \"Prakash\" is:- " + a);
          }
        System.out.println("Size of set is:"+map.size());
    }
}
