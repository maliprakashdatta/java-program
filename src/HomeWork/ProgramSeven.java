//Write a program to print remark according to the grade obtained using switch? statement
package HomeWork;
import java.util.Scanner;
public class ProgramSeven
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Five Subject Marks :");
        int marks1 = input.nextInt();
        int marks2 = input.nextInt();
        int marks3 = input.nextInt();
        int marks4 = input.nextInt();
        int marks5 = input.nextInt();
        int Total = marks1 + marks2 + marks3 + marks4 + marks5;
        float per = Total/5;
        System.out.println("Total :" + Total);
        System.out.println("Percentage :" + per);
        if (per >= 90)
            System.out.println("Grade A");
        else if (per >= 80)
            System.out.println("Grade B");
        else if (per >= 70)
            System.out.println("Grade C");
        else if (per >= 60)
            System.out.println("Grade D");
        else if (per >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}
