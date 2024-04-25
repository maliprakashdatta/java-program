package LoopStatment;

import java.util.Scanner;

public class demopattern
{
    public static void printPattern(int n)
    {

       // System.out.println("Enter the value of rows:-");
        //Scanner scanner=new Scanner(System.in);
        //int rows=scanner.nextInt();
        int i=1;
        int j=1;
        for (i=1;i<=n;i++)
        {
            System.out.print(" ");
            for (j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        int n=5;
        printPattern(n);
    }
}
