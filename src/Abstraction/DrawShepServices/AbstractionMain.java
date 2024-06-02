package Abstraction.DrawShepServices;

import Abstraction.DrawShepesModel.Shape;

public class AbstractionMain {
    public static void main(String[] args) {
        Shape Shapes =new circle();
        Shapes.Draw();

        Shapes = new Rectangle();
        Shapes.Draw();

        Shapes = new Square();
        Shapes.Draw();


        System.out.println("-----------------------------------");
        // data hiding with abstract class
        AbstractionShape abstractShape = new AbstractionShape();
        abstractShape.Draw();

        abstractShape = new AbstractionShape();
        abstractShape.Draw();

        abstractShape = new AbstractionShape();
        abstractShape.Draw();


    }
}
