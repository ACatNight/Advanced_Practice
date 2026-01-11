package OOP.day4.text1;

public class Test {
    public static void main(String[] args) {
        //创建对象 并且调用方法
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();
        System.out.println("=========");
        //创建哈士奇的对象
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        h.lookHome();
    }
}
