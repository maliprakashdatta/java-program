package Bitwise;

import java.util.Scanner;

public class Bitwisecalculationpc
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a values:");
        int a=scanner.nextInt();
        System.out.println("Enter b values:");
        int b=scanner.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
}
