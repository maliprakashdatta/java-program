//Write a program to print numbers from 1 to 10.
package HomeWork;

import java.util.Scanner;

public class ProgramElevan11
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Start Value:-");
        int i=scanner.nextInt();
        for (i=0;i<=10;i++)
        {
            System.out.println("Value of I:"+i);
        }

    }
}
