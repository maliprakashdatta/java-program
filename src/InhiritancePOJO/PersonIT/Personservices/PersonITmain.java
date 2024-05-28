//Please implement the below POJO classes with the help of inheritance:
//- Person, Employee, Developer
package InhiritancePOJO.PersonIT.Personservices;

import java.util.Scanner;

public class PersonITmain {
    public static void main(String[] args)
    {
     System.out.println("-----------Employe Information Add Plz---------------");
     System.out.println("Enter the Employe Name:-");
     Scanner emp1=new Scanner(System.in);
     String empName=emp1.nextLine();

     System.out.println("Enter the Employe Address:-");
     Scanner emp2=new Scanner(System.in);
     String empAddress=emp2.nextLine();

     System.out.println("Enter the Employe Age:-");
     Scanner emp3=new Scanner(System.in);
     String empAge=emp3.nextLine();

     System.out.println("["+"Employe Name:-"+ empName +" ,Employe Address:-" + empAddress +" ,Employe Age:-" +empAge+ "]");

     System.out.println("--------------------------------------------");

     System.out.println("-----------Developer Information Add Plz---------------");
     System.out.println("Enter the DeveloperName:-");
     Scanner DN=new Scanner(System.in);
     String DeveloperName=DN.nextLine();

     System.out.println("Enter the DeveloperType:-");
     Scanner DT=new Scanner(System.in);
     String DeveloperType=DT.nextLine();

        System.out.println("Enter the DeveloperSalary:-");
        Scanner DS=new Scanner(System.in);
        String DeveloperSalary=DS.nextLine();

        System.out.println("["+"DeveloperName:-"+ DeveloperName +" ,DeveloperType:-" + DeveloperType +" ,DeveloperSalarye:-" +DeveloperSalary+ "]");
        System.out.println("lvlvlvlvllvllvlvvlvlvlvlvlvlvlvlvlvl");






    }
}

