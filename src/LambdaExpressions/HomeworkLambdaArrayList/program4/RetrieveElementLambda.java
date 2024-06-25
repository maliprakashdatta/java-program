package LambdaExpressions.HomeworkLambdaArrayList.program4;
//Write a Java program to retrieve an element (at a specified index) from a given array list.
import LambdaExpressions.HomeworkLambdaArrayList.program4.retrive;
import java.util.ArrayList;
import java.util.function.Function;

public abstract class RetrieveElementLambda implements retrive {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("Grey");
        colorlist.add("reb");
        colorlist.add("pink");
        colorlist.add("blue");
        colorlist.add("pink");
        System.out.println("ColorList:-"+colorlist);
        // Define a lambda function to retrieve an element at a specified index
        Function<Integer, String> getElementAtIndex = index -> {
            if (index >= 0 && index < colorlist.size()) {
                return colorlist.get(index);
            } else {
                return "Index out of bounds";
            }
        };

        // Retrieve element at index 2
        int indexToRetrieve = 2;
        String element = getElementAtIndex.apply(indexToRetrieve);
        System.out.println("retrive Element at index " + indexToRetrieve + ": " + element);
    }
}
