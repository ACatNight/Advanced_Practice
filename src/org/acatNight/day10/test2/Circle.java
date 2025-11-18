package org.acatNight.day10.test2;

public class Circle extends Shape {
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;

    }

    public Circle(String name,double radius) {
        super(name);
        this.radius =radius;
    }

    @Override
    public double getArea() {
        return 3.14 * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * getRadius();
    }


}
