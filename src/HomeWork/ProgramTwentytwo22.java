//Write a program to enter the numbers till the user wants and at the end the program should display
// the largest and smallest numbers entered.
package HomeWork;

import java.util.Scanner;

public class ProgramTwentytwo22
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = sc.nextInt();
        System.out.println("Enter Second  Number");
        int number2 = sc.nextInt();
            if(number1 > number2)
            {
                number2=number1;
                System.out.println("Largest Number is First");
            }
            else if(number1 < number2)
            {
                number2=number1;
                System.out.println(" smallest Number s is Second");
            }
            else
            {
                System.out.println("Number is Equals");
            }


        }


}
