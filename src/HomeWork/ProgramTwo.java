//Write a program to read gender(M/F) and print the corresponding gender using a switch statement
package HomeWork;

import java.util.Scanner;

public class ProgramTwo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        char Gender;
        System.out.println("Enter gender (M/m or F/f): ");
        Gender=scanner.next().charAt(0);
        switch (Gender)
        {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.printf("Unspecified Gender.");

        }
        System.out.printf("\n");

    }
}
