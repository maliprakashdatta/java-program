// Write a Java program to iterate through all elements in an array list.
package LambdaExpressions.HomeworkLambdaArrayList;

import java.util.ArrayList;

public class LambdaProgram2
{
    public static void main(String[] args)
    {
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        System.out.print("ArrayList: ");
        colorlist.forEach((e) -> {System.out.println(e);;
        });

    }
    }
