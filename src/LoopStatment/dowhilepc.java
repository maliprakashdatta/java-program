package LoopStatment;

import java.util.Scanner;

public class dowhilepc {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Strating Number:-");
        int Number=s1.nextInt();
        do
        {
            System.out.println("Number is printing:-"+Number);
            Number++;
        }while (Number<=500);
    }
}
