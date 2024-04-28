package HomeWork;

import java.util.Scanner;

public class TourismPackage
{
   //public static final TourismPackage=40000;
    public static void main(String[] args)
    {
        System.out.println("-------------------------------------");
        System.out.println(" TourismPackage=40000");
        System.out.println("-------------------------------------");
        System.out.println("Enter the Age Of Tourims:-");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        System.out.println(age);
        //Discount of Toursim
        if (age>=1 && age<=5)
        {
            System.out.println("Discount of 20% =8000 Total=32000");
        } else if(age>=6 && age<=10)
        {
            System.out.println("Dsicount of 10% =4000 Total=36000");
        }else if(age>=11 && age<=18)
        {
            System.out.println("Dsicount of 5% =2000 Total=38000");
        }
        else
        {
            System.out.println("No Discount Full Ticket =40000");
        }
        System.out.println("-------------------------------------");

        }

}

