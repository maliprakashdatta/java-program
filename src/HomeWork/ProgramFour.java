//Write a program to Check whether the number is even or odd using switch statement
package HomeWork;

import java.util.Scanner;

public class ProgramFour
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int Number;
        System.out.println("Ennter the Any Number:");
        Number=scanner.nextInt();
        switch (Number % 2)
        {
            case 0:
                System.out.println("This is a even Number ");
                break;
            case 1:
                System.out.println("This is a Odd Number");

        }
    }
}
