package structural.decorator;

import creational.factory.Shape;

public class BorderDecorator extends Decorator{
    public BorderDecorator(Shape shape) {
        super(shape);
    }
    public void draw(){
        super.draw();
        System.out.println("Adding border to the Shape");
    }
}
