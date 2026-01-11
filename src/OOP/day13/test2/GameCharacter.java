package OOP.day13.test2;

public class GameCharacter {
    private String name = "塑料";
    public void showStatus(){
    }

    public void showStatus(Weapon weapon, Armor armor) {

       System.out.println("角色状态：" + name + "武器:" + weapon.type+ ",护甲:" + armor.name);
    }

    public class Weapon{
        String type;
        int damage;

        public void attack(){
            System.out.println("使用" + type + "造成了" + damage + "点伤害");
        }


    }
    public class Armor{
       String name;
       int defense;

       public void protect(){
           System.out.println("护甲" + name + "抵挡了" + defense + "点伤害");
       }
    }
}
