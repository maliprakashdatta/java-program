package LambdaExpressions.HomeworkLambdaArrayList.program10;
////Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class program10 implements ShuffleList
   {
    public static void main(String[] args) {
        // Original ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Orijnal List:"+list);
        // Lambda expression to shuffle elements
        ShuffleList shuffleList = l -> Collections.shuffle(l);
        // Using the lambda expression to shuffle the list
        shuffleList.shuffle(list);
        // Printing the shuffled list
        System.out.println("Shuffled List: " + list);
    }

    @Override
    public void shuffle(List<String> list) {

    }

   }
