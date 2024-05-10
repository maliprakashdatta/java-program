package DemoProgram;

import java.util.Scanner;
import java.lang.String;

public class AirlineReservationSystems
{
    public static void main(String[] args)
    {

        System.out.println("-----Airline Reservation Systems-----");
        System.out.println("Enter First passenger:-");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Passengar_Id:-");
        int passengarid=scanner.nextInt();

        System.out.println("Enter the Passenger_Name:-");
        String passengarname=scanner.next();

        System.out.println("Enter the Passenger_Address:-");
        String passengaraddress=scanner.next();

        System.out.println("Enter the Passenger_Gender:-");
        String passengargender=scanner.next();
        System.out.println("----Total Information--------");
        System.out.println("Passengarid:-"+passengarid);
        System.out.println("Passengar_Name:-"+passengarname);
        System.out.println("Passengar_Address:-"+passengaraddress);
        System.out.println("Passengar_Gender:-"+passengargender);

       

    }
}
