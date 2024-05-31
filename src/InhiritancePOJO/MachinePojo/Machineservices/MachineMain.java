package InhiritancePOJO.MachinePojo.Machineservices;

import java.util.Scanner;

public class MachineMain {
    public static void main(String[] args)
    {
        System.out.println("-------------Washing Machine Details---------");
        System.out.println("Enter the Machine Weight:-");
        Scanner mw=new Scanner(System.in);
        int MachineWeight=mw.nextInt();

        System.out.println("Machine Weight:-"+MachineWeight);
        System.out.println("Enter Machine MachineColor");
        Scanner mc=new Scanner(System.in);
        String MachineColor= mc.nextLine();
        System.out.println("Machine Color:-"+MachineColor);

        System.out.println("-----------------------------------------");
        System.out.println("-------------JCB Machine Details---------");
        System.out.println("Enter the jcbtype:-");
        Scanner jt=new Scanner(System.in);
        String jcbtype=jt.nextLine();
        System.out.println("JCB Type:-"+jcbtype);

        System.out.println("Enter the jcbworkingspeed:-");
        Scanner jws=new Scanner(System.in);
       int jcbworkingspeed=jws.nextInt();
        System.out.println("JCB jcb working speed:-"+jcbworkingspeed);

        System.out.println("----------CarWashingMachine------------");
        System.out.println("Enter the MachinePrice");
        Scanner cmw=new Scanner(System.in);
        int MachinePrice = cmw.nextInt();
        System.out.println(" Car Washing Machine Price:"+MachinePrice);






    }
}
