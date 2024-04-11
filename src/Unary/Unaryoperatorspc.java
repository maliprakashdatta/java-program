package Unary;

import java.util.Scanner;

public class Unaryoperatorspc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter p value:-");
        int p=scanner.nextInt();
        System.out.println(p++);
        System.out.println(p--);
        System.out.println(p++ + p++);
        System.out.println(p++ + ++p);
        System.out.println(p++ + --p);

    }
}
