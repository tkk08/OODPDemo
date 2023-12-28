package behavioural.strategy;

public class RectangleCalculator implements Calculator{
    @Override
    public long calculateArea(long x, long y) {
        long result = x*y;
        System.out.println("Area of Rectangle is "+result);
        return result;
    }
}
