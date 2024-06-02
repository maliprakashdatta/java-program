package Abstraction.DrawShepServices;

import Abstraction.DrawShepesModel.Shape;

public class circle extends AbstractionMain implements Shape {
    @Override
    public void Draw() {
        System.out.println("circle is Draw..");
    }
}
