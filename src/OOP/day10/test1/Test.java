package OOP.day10.test1;

public class Test {
    public static void main(String[] args) {
        Transport[] list = {new Car("汽车") ,new Boat("轮船"), new Plane("灰机")};

        for (int i = 0; i < list.length ; i++) {
            list[i].move();

        }
    }
}
