package ControlStatment;

import java.util.Scanner;

public class Nestedifelsepc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Voter age:-");
        int Number = scanner.nextInt();
        if (Number==10) {
            System.out.println("This is a 10 Print..");
        }else if(Number==20)
        {
            System.out.println("This is a 20 Print..");
        }
        else if(Number==30)
        {
            System.out.println("This is a 30 Print..");
        }
        else
        {
            System.out.println("Sorry Not Match Value..");
        }

    }
}
