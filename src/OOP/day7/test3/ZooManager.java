package OOP.day7.test3;

import java.util.ArrayList;
import java.util.Random;

public class ZooManager
{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Eagle eagle = new Eagle();
        Fish fish = new Fish();
        Lion lion = new Lion();
        Random r = new Random();

        eagle.setName("苍鹰");
        eagle.setAge(r.nextInt(34)+12);

        fish.setAge(r.nextInt(64)+12);
        fish.setName("鱼儿");

        lion.setName("雄狮");
        lion.setAge(r.nextInt(24)+12);

        animals.add(eagle);
        animals.add(fish);
        animals.add(lion);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < animals.size() ; i++) {
            animals.get(i).showInfo();
            animals.get(i).makeSound();
            animals.get(i).move();
            animals.get(i).eat();
            animals.get(i).sleep();
            animals.get(i).specialSkill();

            sum = animals.get(i).getAge() + sum;
            count++;


        }
        System.out.println("统计完毕");
        System.out.println("一共有" + count + "动物");
        System.out.println("动物的平均年龄为:");
        System.out.println("所有动物的平均年龄为:" + sum / animals.size());
    }

}
