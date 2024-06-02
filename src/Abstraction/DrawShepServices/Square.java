package Abstraction.DrawShepServices;

import Abstraction.DrawShepesModel.Shape;

public class Square extends AbstractionMain implements Shape {
    @Override
    public void Draw() {
        System.out.println("Square is Draw..");
    }
}
