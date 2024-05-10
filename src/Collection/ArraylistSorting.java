package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistSorting {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);
        //Sorting Data
        Collections.sort(list);
        System.out.println(list);
    }
}
