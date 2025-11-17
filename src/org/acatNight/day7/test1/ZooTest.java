package org.acatNight.day7.test1;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class ZooTest {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        Dog d = new Dog();
        d.setName("狗");
        Cat c = new Cat();
        c.setName("猫");

       
        animals.add(d.getName());
        animals.add(c.getName());

        for (int i = 0; i < animals.size() ; i++) {
            if (animals.get(i) == "狗"){
                d.makeSound() ;
                d.DogSound();
            }else {
                c.makeSound();
                c.SoundCat();
            }
        }
    }
}
