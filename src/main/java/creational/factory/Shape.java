package creational.factory;

import behavioural.strategy.Calculator;
import structural.bridge.Painter;

public abstract class Shape {
    Painter painter;
    Calculator calculator;

    public void setPainter(Painter painter) {
        this.painter = painter;
    }

    public abstract void draw();

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    public long calculateArea(long x, long y){
        return this.calculator.calculateArea(x, y);
    }
}
