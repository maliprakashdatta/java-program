import java.util.*;
class HashSetNumber
{
    public static void main(String args[])
    {
        //Creating HashSet and adding elements
        java.util.HashSet<Integer> set=new java.util.HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Iterator<Integer> i=set.iterator();
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
        //Delete
        //set.remove(5);
    }
}  