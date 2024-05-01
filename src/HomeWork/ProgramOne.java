//Write a program to read a weekday number and print weekday name using switch statement
package HomeWork;
import java.util.Scanner;
public class ProgramOne
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int day = 0;
        System.out.println("Enter the Weekday Number:- ");
        day = s1.nextInt();
        switch (day) {
            case 0:
                System.out.println("------------------------");
                System.out.println("Today is Sunday");
                break;

            case 1:
                System.out.println("------------------------");
                System.out.println("Today is  Monday");
                break;
            case 2:
                System.out.println("------------------------");
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("------------------------");
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("------------------------");
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("------------------------");
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("------------------------");
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Please Enter the 0 to 6:-");
                break;
          }
        }
}
