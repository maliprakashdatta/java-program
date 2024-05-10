package Collection;

import java.util.ArrayList;

public class ArrayListRemoveElements
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList:-"+list);
        //Remove Element by index
        Integer rm=list.remove(2);
        System.out.println("ArrayList Removed  Element:-"+rm);
    }
}
