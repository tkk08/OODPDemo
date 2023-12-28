package structural.composite;

import creational.factory.Shape;
import creational.factory.ShapeFactory;
import creational.factory.ShapeType;

import java.util.ArrayList;
import java.util.List;

public class ShapeInventory extends Shape {
    List<Shape> allShapes = new ArrayList<>();
    @Override
    public void draw() {
        for(ShapeType shapeType: ShapeType.values()){
            allShapes.add(ShapeFactory.getShape(shapeType));
        }
    }

    public void listAllShapes(){
        draw();
        System.out.println("Following shapes are available in inventory : -");
        for(Shape shape: allShapes){
            System.out.println(shape.getClass().getSimpleName());
        }
    }
}
