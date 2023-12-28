package structural.decorator;

import creational.factory.Shape;

public class Decorator extends Shape{
   private Shape shape;
   Decorator(Shape shape){
      this.shape = shape;
   }

   @Override
   public void draw() {
      shape.draw();
   }

}
