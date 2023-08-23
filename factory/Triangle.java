package factory;

import java.util.Random;

//Triangle is a ConcreteProduct

public class Triangle implements Figure{
    private int lenSide1 = 0, lenSide2 = 0, base = 0;
    private int heigth = 0;
    private Random random = new Random();

    public Triangle() {
        this.lenSide1 = random.nextInt(100);
        this.lenSide2 = random.nextInt(100);
        this.base = random.nextInt(100);
        this.heigth = random.nextInt(100);
    }

    public int calculatePerimeter() {
        return lenSide1 + lenSide2 + base;
    }

    public double calculateArea() {
        return (double) ((base * heigth) / 2);
    }

    public void printStatistics() {
        System.out.println("Triangle\nbase = " + base + " heigth = " + heigth + " side1 = " + lenSide1 + " side2 = " + lenSide2);
        System.out.println("Perimeter = " + calculatePerimeter());
        System.out.println("Area = " + calculateArea());
    }
}
