package Array;
import java.util.Scanner;
public class TwoDimationalpc
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of array:-");
        int  rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int[][] numbers=new int[rows][cols];
        System.out.println("Enter the elemants of array");
        for(int i=0;i<rows;i++)//inputed
        {
               for (int j=0;j<cols;j++)
               {
                   numbers[i][j] = scanner.nextInt();
               }
        }

        System.out.println("Two Dimational Array elemants:-");
        for (int i=0;i<rows;i++)//output
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.println(numbers[i][j] + " ");
            }
        }
        System.out.println("Enter any Array and Found Location :-");
            int x=scanner.nextInt();
        for (int i=0;i<rows;i++)//output
        {
            for (int j = 0; j < cols; j++)
            {
                if (numbers[i][j] == x)
                {

                    System.out.println("x found location,(" + i + "," + j + ",)");
                }
            }
        }

   }
}