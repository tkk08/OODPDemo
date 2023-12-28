package creational.factory;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType){
        switch(shapeType){
            case Square:return new Square();
            case Rectangle: return new Rectangle();
            case Circle:return new Circle();
            default: return null;
        }
    }
}
