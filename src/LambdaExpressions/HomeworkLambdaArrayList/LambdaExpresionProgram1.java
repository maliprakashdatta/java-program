//Write a Java program to create an array list, add some colors (strings) and print out the collection.
package LambdaExpressions.HomeworkLambdaArrayList;

import java.util.ArrayList;

class LambdaExpresionProgram1 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.print("ArrayList: ");
        // iterate over each element of arraylist
        // using forEach() method
        colorlist.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}
