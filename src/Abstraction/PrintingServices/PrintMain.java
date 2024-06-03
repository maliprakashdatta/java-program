package Abstraction.PrintingServices;

import Abstraction.Printingmodel.Print;

public class PrintMain
{
    public static void main(String[] args){
        Print print=new BlackPrint();
        print.print();

        print=new ColorPrint();
        print.print();

        //

    }
   }

