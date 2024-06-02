package Abstraction.DrawShepServices;

import Abstraction.DrawShepesModel.Shape;

public class Rectangle extends AbstractionMain implements Shape {
    @Override
    public void Draw() {
        System.out.println("Rectangle is Draw..");
    }
}
