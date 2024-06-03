package Abstraction.PrintingServices;

import Abstraction.Printingmodel.Print;

public class ColorPrint extends PrintMain implements Print {
    @Override
    public void print() {
        System.out.println("it is Color Printer");
    }
}
