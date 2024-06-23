package LambdaExpressions;

import java.util.ArrayList;

public class Program1LambdaArrayList {
    public static void main(String[] args) {
    ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        //System.out.println("ColorList:-"+colorlist);
        colorlist.forEach( (n) -> { System.out.println("colorlist of ArrayList:-"+n); } );
    }
}
