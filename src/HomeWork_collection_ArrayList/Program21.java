//Write a Java program to replace the second element of an ArrayList with the specified element.
package HomeWork_collection_ArrayList;

import java.util.ArrayList;

public class Program21
{
    public static void main(String[] args)
    {
        ArrayList<String>   Employ_Name= new ArrayList<String>();

        Employ_Name.add("Shivaji");
        Employ_Name.add("Amol");

        System.out.println("Original Employ_Name :- " + Employ_Name);
        String new_Employ_Name = "Nirav";
       Employ_Name.set(1,new_Employ_Name);
        System.out.println("------------------------------------------------------");
        int num=Employ_Name.size();
        System.out.println("Changed  Employ_Name:-");
        for(int i=0;i<num;i++)
            System.out.println(Employ_Name.get(i));

    }


}
