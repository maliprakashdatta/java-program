package Collection;

import java.util.ArrayList;

public class ArrayListAddingElementsInt
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList Int Value:-"+list);
        //Adding Element by index
        list.add(6);
        System.out.println("ArrayList New Added Element:-"+list);
    }
}
