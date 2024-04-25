import java.util.Scanner;

public class simple
{

    public static void printPattern(int n)
    {

        int i, j;

        for (i = 1; i <= n; i++)
        {

            for (j = 1; j <=i; j++)
            {
                System.out.print(i);
            }

            for (j = 1; j <=i; j++)
            {
                System.out.print(" *");
            }

            System.out.println();
        }
    }


    public static void main(String args[])
    {
        System.out.println("Enter Pattern Stage:- ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        printPattern(n);
    }
}