package Assignment;

import java.util.Scanner;

public class Equaltopc
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the a value:-");
        int  a=scanner.nextInt();
        a+=4;
        {
            System.out.println("value of Addition a+=4:-->"+a);
        }
        a-=4;
        {
            System.out.println("value of Substration a-=4:-->"+a);

        }
        a*=4;
        {
            System.out.println("value of Multipication a*=4:-->"+a);

        }
        a/=2;
        {
            System.out.println("value of Division a*=4:-->"+a);

        }

    }
}
