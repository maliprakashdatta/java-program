package Abstraction.DrawShepServices;

import Abstraction.DrawShepesModel.Shape;

public class AbstractionShape implements Shape {
    @Override
    public void Draw() {
        System.out.println("Base shape drawn.");
    }
}
