//Write a program to check whether a person is eligible to vote or Not using switch statement
package HomeWork;

import java.util.Scanner;

public class ProgramNine
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age = 0;
        System.out.printf("Enter the Voter Age : ");
        age = scanner.nextInt();
       int Human= age >= 18?2:1;
        switch (Human)
        {
            case 1:
                System.out.println("You are NOT Eligible for Voting...");
                break;

            case 2:
                System.out.println("You are  Eligible for Voting...");
                break;
        }

    }
}
