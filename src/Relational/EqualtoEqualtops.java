package Relational;

import java.util.Scanner;

public class EqualtoEqualtops
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter rel1 value:-");
        int rel1=scanner.nextInt();
        System.out.println("Enter rel2 value:-");
        int rel2=scanner.nextInt();
        if(rel1==rel2)
        {
            System.out.println("Is Equal value..");
        }
        else
        {
            System.out.println("Is NOT Equal value..");
        }

    }
}
