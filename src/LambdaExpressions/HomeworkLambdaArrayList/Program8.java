package LambdaExpressions.HomeworkLambdaArrayList;
////Write a Java program to sort a given array list.

         import java.util.ArrayList;
         import java.util.List;

public class Program8 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> colorlist = new ArrayList<>();
        colorlist .add("1");
        colorlist .add("3");
        colorlist .add("4");
        colorlist .add("5");
        colorlist .add("2");
        // Print the original list
        System.out.println("Original list: " + colorlist );
        // Sort the ArrayList using lambda
        colorlist .sort((String s1, String s2) -> s1.compareTo(s2));
        // Print the sorted list
        System.out.println("Sorted list: " + colorlist );
    }
}

