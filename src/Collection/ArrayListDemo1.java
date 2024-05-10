package Collection;

import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //add Number
        list.set(2,3);
        System.out.println("Set element:-"+list);
        //Contain Elemant
        list.contains(0);
        System.out.println("Contain the elemants"+list);
        //Array Size
        list.size();
        System.out.println("Array Size:-"+list);
        //remove arraylist
        list.remove(2);
        System.out.println("Remove the arraylist"+list);
        //Set Size
        list.set(2,6);
        System.out.println("Set The Element:-"+list);
        //get Size
        list.get(1);
       System.out.println("Get Element of Array List:-"+list);

    }

}
