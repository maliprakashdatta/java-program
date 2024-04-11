package Relational;
import java.util.Scanner;
public class lessthanpc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter less1 value:-");
        int less1=scanner.nextInt();
        System.out.println("Enter less2 value:-");
        int less2=scanner.nextInt();
        if(less1>less2)
        {
            System.out.println("less1 is less2 value..");
        }
        else
        {
            System.out.println("less1 is NOT less2 value..");
        }

    }
}

