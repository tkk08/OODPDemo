package creational.factory;

public class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Rectangle created");
    }
    public void draw(){
        if(painter != null){
            painter.paint();
        }
    }
}
