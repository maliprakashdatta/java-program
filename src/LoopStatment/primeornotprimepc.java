package LoopStatment;

import java.util.Scanner;

public class primeornotprimepc
{
    public static void main(String[] args) {
        System.out.println("Enter the any Value:-");
        Scanner scanner=new Scanner(System.in);
        int no=scanner.nextInt();
        int index=1;
        do {
            index++;
        }while (no%index !=0);
        System.out.println((index==no)?"Prime No":"Not a Prime No");
    }
}
