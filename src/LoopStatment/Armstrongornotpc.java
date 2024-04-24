package LoopStatment;

import java.util.Scanner;

public class Armstrongornotpc
{
    public static void main(String[] args) {
        System.out.println("Enter the Positve Number:");
        Scanner scanner=new Scanner(System.in);
        int ar=scanner.nextInt();
        int index=0;
        while (ar>0)
        {
            ar=ar/10;
            index++;
        }
        if (index==ar) {
            System.out.println("This is Armstrong Number");
        }
        else {
            System.out.println("This is NOT Armstrong Numbre");
        }
    }
}
//Not Proper code
