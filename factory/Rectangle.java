package factory;

import java.util.Random;

public class Rectangle implements Figure{
    private int base, heigth;
    private Random random = new Random();
    
    public Rectangle() {
        this.base = random.nextInt(100);
        this.heigth = random.nextInt(100);
    }


    public int calculatePerimeter() {
        return (2 * base) + (2 * heigth);
    }

    public double calculateArea() {
        return (double) base * heigth;
    }

    public void printStatistics() {
        System.out.println("Rectangle\nbase = " + base + " heigth = " + heigth);
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }
}
