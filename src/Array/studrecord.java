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
        System.out.println("Enter Student Name-:");
        //Scanner scanner1=new Scanner(System.in);
        String[] names={"Prakash","Mali"};
        //[] names=new String[1];
        //names[0]=scanner1.toString();
        //String[] names={"Prakash"};
        for(int i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }

    }
}
