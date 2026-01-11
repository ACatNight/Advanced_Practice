package OOP.day13.test2;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        GameCharacter game = new GameCharacter();
        GameCharacter.Weapon weapon = game.new Weapon();
        GameCharacter.Armor armor = game.new Armor();
        Random r = new Random();





        weapon.type = "木剑";
        weapon.damage = r.nextInt(10)+1;

        armor.name = "铁护甲";
        armor.defense = r.nextInt(5)+1;



        weapon.attack();

        armor.protect();

        game.showStatus(weapon,armor);





    }
}
