//Write a Java program to copy one array list into another.
package LambdaExpressions.HomeworkLambdaArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Program9
{
    public static void main(String[] args)
    {
        // Original ArrayList
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Elderberry");
        // Destination ArrayList
        List<String> destinationList = new ArrayList<>();
        // Lambda expression to copy elements
        Consumer<String> copyElement = element -> destinationList.add(element);

        // Using forEach to copy elements
        originalList.forEach(copyElement);

        // Printing the destination list
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List: " + destinationList);
    }
}
