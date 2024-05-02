//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
// For example, if the input is 12345, the output should be 54321
package HomeWork;

import java.util.Scanner;

public class ProgramSixteen16
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Serial Number:-");
        int num=scanner.nextInt();
        System.out.println("------------------------------");
       System.out.println("Enter Real Number is:-"+num);
        int reverse = 0;
        while(num != 0)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse number is: " + reverse);
        System.out.println("------------------------------");
    }
}
