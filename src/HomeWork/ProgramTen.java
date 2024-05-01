//Write a program to find the Maximum of Two Numbers using switch statement
package HomeWork;

import java.util.Scanner;

public class ProgramTen {
    public static void main(String[] args) {
        System.out.println("Max Number Program");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        int Number1=scanner.nextInt();
        System.out.println("Enter Second  Number");
        int Number2=scanner.nextInt();
        int find=Number1>Number2? 2:1;
        switch (find)
        {
            case 0:
                find = Number1==Number2?1:0;
                switch(find)
                {
                    case 0:
                        System.out.println("Maximum Number is "+Number2);
                        break;
                    case 1:
                        System.out.println("Both are Equals");
                        break;
                }
                break;

            case 1:
                System.out.println("Maximum Number is "+Number1);
                break;

        }
    }
}
