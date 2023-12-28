package creational.factory;

public class Square extends Shape{
    Square(){
        System.out.println("Square created");
    }
    public void draw(){
        if(painter != null){
            painter.paint();
        }
    }
}
