package Array;

import java.util.Scanner;

public class studrecord
{
    public static void main(String[] args) {
        System.out.println("Enter Student ID:");
        Scanner scanner=new Scanner(System.in);
        int[] id=new int[1];
        id[0]=scanner.nextInt();
       // System.out.println("Enter Student Name:");
        //char Name=new Character();
        int Number=0;
        while (Number <= 0)
        {

            System.out.println("Student ID is:-" +Number+ "=" +id[Number]);
            Number++;
        }

    }
}
