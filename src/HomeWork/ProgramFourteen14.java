//Write a program to find the factorial value of any number entered through the keyboard.
package HomeWork;

import java.util.Scanner;

public class ProgramFourteen14
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the Any Number:-");
        int number=s1.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}
