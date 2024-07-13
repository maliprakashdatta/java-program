package Operators.ArithmaticProgram;

import java.util.Scanner;

public class additionpseudocode
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num1 value:-");
        int num1=scanner.nextInt();
        System.out.println("Enter the num2 value:-");
        int num2=scanner.nextInt();
        int num3;
        num3=num1+num2;
        System.out.println("Value of Num3:-"+ num3);


    }
}
