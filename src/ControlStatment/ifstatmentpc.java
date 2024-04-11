package ControlStatment;

import java.util.Scanner;

public class ifstatmentpc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 18 plus Voter age:-");
        int age=scanner.nextInt();
        if(age>18)
        {
            System.out.println("Are you Eligible for Voating ");
        }

    }
}
