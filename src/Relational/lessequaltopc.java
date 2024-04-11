package Relational;
import java.util.Scanner;
public class lessequaltopc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter lessequal1 value:-");
        int lessequal1=scanner.nextInt();
        System.out.println("Enter lessequal2 value:-");
        int lessequal2=scanner.nextInt();
        if(lessequal1>=lessequal2)
        {
            System.out.println("lessequal1 is lessequal2 value..");
        }
        else
        {
            System.out.println("lessequal1 is NOT lessequal2 value..");
        }

    }
}


