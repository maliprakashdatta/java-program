package Array;

import java.util.Scanner;

public class ThreeDimationalpc
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of array:-");
        int  rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int num3=scanner.nextInt();
        int[][][] numbers=new int[rows][cols][num3];
        System.out.println("Enter the elemants of array");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                for (int k=0;k<num3;k++)
                {
                    numbers[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println("Three Dimational Array elemants:-");
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                for (int k=0;k<num3;k++)
                {
                    System.out.println(numbers[i][j][k]+ " ");
                }
            }

        }
    }
}
