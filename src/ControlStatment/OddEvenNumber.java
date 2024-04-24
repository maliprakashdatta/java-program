package ControlStatment;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        System.out.println("Enter the Number:");
        Scanner s1=new Scanner(System.in);
        int no=s1.nextInt();
        if(no%2==0)
        {
            System.out.println("This Is Evean Numbers");
        }
        else
        {
            System.out.println("This Is Odd Number ");
        }
    }
}
