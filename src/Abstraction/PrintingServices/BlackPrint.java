package Abstraction.PrintingServices;

import Abstraction.Printingmodel.Print;

public class BlackPrint extends PrintMain implements Print {
    @Override
    public void print() {
        System.out.println("It is Black Printer");
    }
}
