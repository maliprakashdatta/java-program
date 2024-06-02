package Abstraction.DriverServices;

import Abstraction.DrawShepServices.AbstractionMain;
import Abstraction.DriverModel.Runing;

public class DeiverMain {
    public static void main(String[] args)
    {
        Runing runing=new CarDriver();
        runing.Runing();
        System.out.println("Is a Car Driver..");

        runing=new TruckDriver();
        runing.Runing();
        System.out.println("Is a Truck Driver.. ");

        System.out.println("------------------------------------");
        //to use Abstraction Runing program..
        AbstractionMain abstractionMain=new AbstractionMain();
        abstractionMain.toString();
        System.out.println("All is Driver");

    }
}
