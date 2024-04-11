package Bitwise;

import java.util.Scanner;

public class Andpc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a values:");
        int a=scanner.nextInt();
        System.out.println("Enter b values:");
        int b=scanner.nextInt();
        System.out.println("Enter c values:");
        int c=scanner.nextInt();

        System.out.println(a<b&&a<c);


    }
}
