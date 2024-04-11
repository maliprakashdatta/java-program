package ControlStatment;

import java.util.Scanner;

public class Switchcasepc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter case Number:-");
        int Number = scanner.nextInt();
      switch (Number)
        {
            case 1:
                System.out.println("case one is print..");
                break;
            case 2:
                System.out.println("case two is print..");
                break;
            case 3:
                System.out.println("case Three is print..");
                break;
            case 4:
                System.out.println("case Four is print..");
                break;
            case 5:
                System.out.println("case five is print..");
                break;
            default:
                System.out.println("Sorry NOT match Value");

        }

    }
}
