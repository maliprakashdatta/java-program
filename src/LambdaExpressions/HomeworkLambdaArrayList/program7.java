//Write a Java program to search for an element in an array list.
package LambdaExpressions.HomeworkLambdaArrayList;
import java.util.ArrayList;
public class program7 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colorlist=new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("Teal");
        colorlist.add("Maron");
        colorlist.add("Yellow");
        colorlist.add("Pink");
        // Element to search for
        String searchElement = "Grey";
        // Use lambda function to search for the element
        boolean found = colorlist.stream().anyMatch(element -> element.equals(searchElement));
        // Print the result
        if (found) {
            System.out.println(searchElement + " is found in the list.");
        } else {
            System.out.println(searchElement + " is not found in the list.");
        }
    }
}
