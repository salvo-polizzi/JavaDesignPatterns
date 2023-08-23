package factory;

import java.util.Random;

public class Square implements Figure{
    private int side;
    private Random random = new Random();

    public Square() {
        this.side = random.nextInt(100);
    }

    public int calculatePerimeter() {
        return this.side * 4;
    }

    public double calculateArea() {
        return (double) (side * side);
    }

    public void printStatistics() {
        System.out.println("Square\nside = " + side);
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }
}
