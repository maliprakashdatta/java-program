package LoopStatment;

import java.util.Scanner;

public class Continuepc {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Strating Number:-");
        int Number=s1.nextInt();
        while (Number<=50)
        {
            System.out.println("Number is printing:-"+Number);
            Number++;
            if (Number==25)
            {
                continue;
            }
        }
    }
}
