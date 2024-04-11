package ControlStatment;

import java.util.Scanner;

public class ifelsepc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Voter age:-");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Are you Eligible for Voating ");
        } else
        {
            System.out.println("Not Eligible for Voating..");
        }

    }
}
