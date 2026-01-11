package OOP.day10.test3;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name,double width,double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
