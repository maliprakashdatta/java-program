//Write a program that prompts the user to input a positive integer.
// It should then output a message indicating whether the number is a prime number.
package HomeWork;

import java.util.Scanner;

public class ProgramEighteen18
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nput a positive integer:-");
        int num=scanner.nextInt();
        System.out.println("------------------------------");
        int  Number= 2;
        if (  Number<= num / 2 )
        {

            System.out.println(num + " is a prime number.");
            ++Number;
        }
        else {
            System.out.println(num + " is not a prime number.");
            System.out.println("------------------------------");
        }
    }

}

