package creational;

import behavioural.strategy.CircleCalculator;
import behavioural.strategy.SquareCalculator;
import structural.bridge.Painter;
import structural.bridge.RedPainter;
import creational.factory.Shape;
import creational.factory.ShapeFactory;
import creational.factory.ShapeType;
import creational.singleton.CustomLogger;
import structural.composite.ShapeInventory;
import structural.decorator.BorderDecorator;
import structural.decorator.Decorator;

public class MainApplication {
    /**
     * This 2D inventory management system app is to demonstrate creational,
     * structural, behavioural design patterns
     * @param args
     */

    public static void main(String[] args) {
        //Creational - Singleton
        CustomLogger logger = CustomLogger.logger();
        logger.info("Main application started");

        //Creational - Factory
        Shape shape = ShapeFactory.getShape(ShapeType.Square);

        //Structural - Bridge
        Painter painter = new RedPainter();
        shape.setPainter(painter);
        shape.draw();

        //Structural - Decorator
        Shape shape2 = ShapeFactory.getShape(ShapeType.Circle);
        Decorator decorator = new BorderDecorator(shape2);
        decorator.draw();

        //Structural - Composite
        ShapeInventory shapeInventory = new ShapeInventory();
        shapeInventory.listAllShapes();

        //Behavioural - strategy
        shape.setCalculator(new SquareCalculator());
        shape.calculateArea(2,2);

        shape2.setCalculator(new CircleCalculator());
        shape2.calculateArea(2,2);

    }
}
