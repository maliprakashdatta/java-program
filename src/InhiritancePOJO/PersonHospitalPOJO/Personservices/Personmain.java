package InhiritancePOJO.PersonHospitalPOJO.Personservices;

import java.util.Scanner;

public class Personmain {
    public static void main(String[] args)
    {
        System.out.println("-----------Doctor Information Add Plz---------------");
        System.out.println("Enter the Doctor Name:-");
        Scanner doctor=new Scanner(System.in);
        String DoctorName=doctor.nextLine();

        System.out.println("Enter the Hospital Name:-");
        Scanner Hospital=new Scanner(System.in);
        String HospitalName=Hospital.nextLine();

        System.out.println("--------------Doctor Addeded Information IS -----------------------");
        System.out.println("Doctor Name Is:-"+DoctorName);
        System.out.println("HospitalName Name Is:-"+HospitalName);

        System.out.println("-----------Surgeon Information Add Plz---------------");
        System.out.println("Enter the Surgeon Name:-");
        Scanner Surgeon1=new Scanner(System.in);
        String SurgeonName=Surgeon1.nextLine();

        System.out.println("Enter the SurgeonType:-");
        Scanner Surgeon2=new Scanner(System.in);
        String SurgeonType=Surgeon2.nextLine();
        System.out.println("--------------Surgeon Addeded Information IS -----------------------");

        System.out.println("SurgeonName Is:-"+SurgeonName);
        System.out.println("SurgeonType Is:-"+SurgeonType);
        System.out.println("===Thanks For Using program===");


    }
}
