//Write a Java program to insert an element into the array list at the first position.
package LambdaExpressions.HomeworkLambdaArrayList;

import java.util.ArrayList;
interface myfunction<T>
{
    void list(T t);
}
public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        //Define a lambda expression using a custom functional interface
        myfunction printitem = (item) -> {
            System.out.println(item);
        };
        colorlist.forEach(printitem::list);
     //insert an element
        colorlist.add(0,"Red");
        System.out.println("----------------------------------");
        System.out.println("insert an New element:"+colorlist);
    }
}
