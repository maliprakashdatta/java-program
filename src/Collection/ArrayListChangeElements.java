package Collection;

import java.util.ArrayList;

public class ArrayListChangeElements
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList Old Element:-"+list);
        //Changing Elements
        list.set(2,3);
        System.out.println("ArrayList Changes new  Elements:-"+list);
    }
}
