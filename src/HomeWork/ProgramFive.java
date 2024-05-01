//Write a program to Find the number of days in a month using a switch statement
package HomeWork;
import java.util.Scanner;
public class ProgramFive
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int mon = 0;
        int days;
        System.out.println("Enter the Month Number : ");
        mon = input.nextInt();
        switch(mon)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of Days 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of Days 30");
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("Please Enter the 1 to 12");
                break;

        }
    }
}
