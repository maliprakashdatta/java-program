package LambdaExpressions.HomeworkLambdaArrayList;
//////Write a Java program to remove the third element from an array list.
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class Program6 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> colorlist = new ArrayList<>();
        colorlist.add("red");
        colorlist.add("pink");
        colorlist.add("blue");
        colorlist.add("yellow");
        colorlist.add("black");
        System.out.println("Original List: " + colorlist);
        // Check if the list has at least 3 elements
        if (colorlist.size() > 2) {
            // Remove the third element using a lambda function
            Consumer<List<String>> removeThirdElement = l -> l.remove(2);
            removeThirdElement.accept(colorlist);
        } else {
            System.out.println("The list does not have enough elements to remove the third one.");
        }

        System.out.println("Updated List: " + colorlist);
    }
}
