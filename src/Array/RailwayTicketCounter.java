package Array;

import LoopStatment.WhileLooppc;

import java.util.Scanner;

public class RailwayTicketCounter
{
    public static void main(String[] args)
    {
        System.out.println("*****Railway Ticket Counter*****");
        Scanner scanner=new Scanner(System.in);
        int[] Ticket=new int[5];
        System.out.println("Enter First passenger:-");
        Ticket[0]=scanner.nextInt();
        System.out.println("Enter Second passenger:-");
        Ticket[1]=scanner.nextInt();
        System.out.println("Enter Thired passenger:-");
        Ticket[2]=scanner.nextInt();
        System.out.println("Enter Fourth passenger:-");
        Ticket[3]=scanner.nextInt();
        System.out.println("Enter Fifth passenger:-");
        Ticket[4]=scanner.nextInt();
        int count=0;
        while (count <= 4)
        {
            System.out.println("Passenger Count:- " +count+ "=" +Ticket[count]);
            count++;
        }

        int count1=20;//Rate of Ticket.
        int count2;
        count2=count*count1;
        System.out.println("---------------------------------------");
        System.out.println("--Only Pune TO Mumbai--");
        System.out.println("Per Passenger Ticket Amount is:"+count2);
        System.out.println("Total Amount in Ticket="+count*count2);
        System.out.println("---------------------------------------");
    }
}
