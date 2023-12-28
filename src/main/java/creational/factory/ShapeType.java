package creational.factory;

public enum ShapeType {
    Square, Rectangle, Circle;

    String getType(){
        return this.toString();
    }
}
