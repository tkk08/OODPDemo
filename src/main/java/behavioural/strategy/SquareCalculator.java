package behavioural.strategy;

public class SquareCalculator implements Calculator{
    @Override
    public long calculateArea(long x, long y) {
        long result = x*y;
        System.out.println("Area of Square is "+result);
        return result;
    }

}
