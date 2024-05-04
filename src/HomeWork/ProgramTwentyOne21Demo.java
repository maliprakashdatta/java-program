///Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
//negative and zeros entered.
package HomeWork;
import java.util.Scanner;

public class ProgramTwentyOne21Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("This Number is Positive");
        } else if (num == 0) {
            System.out.println("This Number is negative Becouse Zero");
        } else {
            System.out.println("You Enter only 1 and 0 Number Dontd type Another");
        }
    }
}