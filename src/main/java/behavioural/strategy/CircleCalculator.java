package behavioural.strategy;

public class CircleCalculator implements Calculator{


    @Override
    public long calculateArea(long x, long y) {
        long result = (long) (Math.PI * x * x);
        System.out.println("Area of Circle is "+result);
        return result;
    }
}
