package OOP.day10.test2;

public class Square extends Shape
{
    private double side;

    public Square(String name,double sideV   ) {
        super(name);
        this.side = side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }
}
