package ExceptionHandling;

import java.util.Scanner;

public class Demopc
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Value of A:");
        Scanner scanner=new Scanner(System.in);
        try {
            int a=scanner.nextInt();
            //System.out.println(a);
            System.out.println("Enter the Value of B:");
            int b=scanner.nextInt();
            //System.out.println(b);
            int c;
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("Dont Enter A or B Vale is Zero");
        }
finally {
            System.out.println("are you ok...");
        }

    }
}
