package IncrementandDecrementOperator;

import java.util.Scanner;

public class Numminusminus {
    public static void main(String[] args)
    {
        System.out.println("Enter the Starting Number:-");
        Scanner scanner=new Scanner(System.in);
        int numcount=scanner.nextInt();
        System.out.println("****Decremented Numcount****");
        while (numcount >= 0)
        {
            System.out.println(numcount);
            numcount--;
        }
        System.out.println("****End Decremented Numcount****");
    }
}
