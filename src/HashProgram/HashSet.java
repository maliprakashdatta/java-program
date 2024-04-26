import java.util.*;
class HashSet
{
    public static void main(String args[])
    {
        //Creating HashSet and adding elements
        java.util.HashSet<String> set=new java.util.HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        //SetSize
        System.out.println("Size of set is:"+set.size());
       //Print the element
        System.out.println(set);
        if (set.contains(1))
        {
            System.out.println("Set contains one");
        }
        if (!set.contains(6))
        {
            System.out.println("dose not contains");

        }
    }
}  