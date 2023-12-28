package creational.factory;

public class Circle extends Shape{
    Circle(){
        System.out.println("Circle created");
    }
    public void draw(){
        if(painter != null){
            painter.paint();
        }
    }
}
