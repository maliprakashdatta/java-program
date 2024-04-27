import java.util.*;
class HashSetNumber
{
    public static void main(String args[])
    {
        //Creating HashSet and adding elements
        java.util.HashSet<String,Integer> set=new java.util.HashSet();
        set.add("India",140);
        set.add("MH",30);
        set.add("UP",40);
        set.add("KA",50);
        set.add("MP",20);
        Iterator<String,Integer> i=set.iterator();
        //while(i.hasNext())
        //{
            //System.out.println(i.next());
       // }
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