package Array;
import java.util.Scanner;
public class OneDimationalpc
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of array:-");
        int arrLength=scanner.nextInt();
        int anArray[]=new int[arrLength];
        System.out.println("Enter the elemants of array");
        for(int i=0;i<arrLength;i++)
        {
            anArray[i]=scanner.nextInt();

        }
        System.out.println("One Dimational Array elemants:-");
        for (int i=0;i<arrLength;i++)
        {
            System.out.println(anArray[i]+" ");
        }
        System.out.println("End One Dimational Array elemants:-");
    }
}