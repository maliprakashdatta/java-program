//Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of tha
package HomeWork;
import java.util.Scanner;
public class ProgramThirteen13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        for (int i = 0; i < 10; i++)
        {

            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            System.out.println("------------------------");
        }
    }
}
