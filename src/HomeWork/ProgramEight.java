//Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers )
package HomeWork;

import java.util.Scanner;

public class ProgramEight
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int Num1,Num2,result;
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter The Number(1-4) : ");
        result = scanner.nextInt();
        switch(result)
        {
            case 1:
                System.out.print("Enter the Number 1:-");
                Num1=scanner.nextInt();
                System.out.print("Enter the Number 2:-");
                Num2=scanner.nextInt();
                System.out.print("Addition = " + (Num1+Num2));
                break;
            case 2:
                System.out.print("Enter the Number 1:-");
                Num1=scanner.nextInt();
                System.out.print("Enter the Number 2:-");
                Num2=scanner.nextInt();
                System.out.print("Subtraction = " + (Num1-Num2));
                break;
            case 3:
                System.out.print("Enter the Number 1:-");
                Num1=scanner.nextInt();
                System.out.print("Enter the Number 2:-");
                Num2=scanner.nextInt();
                System.out.print("Multiplication = " + (Num1*Num2));
                break;
            case 4:
                System.out.print("Enter the Number 1:-");
                Num1=scanner.nextInt();
                System.out.print("Enter the Number 2:-");
                Num2=scanner.nextInt();
                System.out.print("Division = " + (Num1/Num2));
                break;
            default:
                System.out.print("Enter Proper Value");

        }   }
}
