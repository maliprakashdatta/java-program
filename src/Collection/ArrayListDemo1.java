package Collection;

import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //remove arraylist
        list.remove(2);
        System.out.println("Remove the arraylist"+list);

    }

}
