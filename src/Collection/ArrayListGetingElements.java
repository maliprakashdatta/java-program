package Collection;

import java.util.ArrayList;
import java.util.ArrayList;

public class ArrayListGetingElements
{
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList Int Value:-" + list);
        //Acessing Element
        Integer int1=list.get(1);
        System.out.println("ArrayList Accessing Element:-" + int1);
    }
}
