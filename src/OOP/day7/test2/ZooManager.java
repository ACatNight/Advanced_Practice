package OOP.day7.test2;

import java.util.ArrayList;

public class ZooManager {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Lion l = new Lion();
        Eagle e = new Eagle();
        Fish f = new Fish();

        l.setAge(12);
        l.setName("雄狮");
        l.setDiet("食肉");

        e.setAge(16);
        e.setDiet("食肉");
        e.setName("苍鹰");

        f.setAge(12);
        f.setName("小鱼");
        f.setDiet("食草");

        animals.add(l);
        animals.add(e);
        animals.add(f);

        for (int i = 0; i < animals.size() ; i++) {
            animals.get(i).showInfo();


        }
    }
}
