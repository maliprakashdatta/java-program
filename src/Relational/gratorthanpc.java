package Relational;
import java.util.Scanner;
public class gratorthanpc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter grator1 value:-");
        int grator1=scanner.nextInt();
        System.out.println("Enter grator2 value:-");
        int grator2=scanner.nextInt();
        if(grator1<grator2)
        {
            System.out.println("grator1 is grator2 value..");
        }
        else
        {
            System.out.println("grator1 is NOT grator2 value..");
        }

    }
}


