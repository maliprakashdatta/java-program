package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class LambadaArrayListinteger {
    public static void main(String[] args) {
    ArrayList<Integer> Number=new ArrayList<>();
        Number.add(1);
        Number.add(3);
        Number.add(2);
        Number.add(5);
        Number.add(4);
        Number.forEach( (n) -> { System.out.println("Orignal ArrayList:-"+Number); } );
    //to sort a given array list
        Collections.sort(Number);
        System.out.println("To sorted a given array list"+Number);
    }
}
