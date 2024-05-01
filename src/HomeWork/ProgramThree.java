//Write a program to Check whether a character is a vowel or consonant using switch statement
package HomeWork;
import java.io.*;
import java.util.Scanner;

public class ProgramThree
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        char Y;
        System.out.println("Enter The Vowel Value:");
        Y=scanner.next().charAt(0);
        switch (Y)
        {
            case 'a':
            case 'A':
                System.out.println(" It is a Vowel. y == 'a'");
                break;
            case 'e':
            case 'E':
                System.out.println("It is a Vowel. y == 'e'");
                break;
            case 'i':
            case 'I':
                System.out.println("It is a Vowel.y == 'i'");
                break;
            case 'o':
            case 'O':
                System.out.println("It is a Vowel. y == 'o'");
                break;
            case 'u':
            case 'U':
                System.out.println("It is a Vowel. y == 'u'");
                break;
            default:
                System.out.println("It is a Consonant.");
        }

        }

    }

