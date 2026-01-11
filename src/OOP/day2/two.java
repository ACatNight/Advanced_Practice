package OOP.day2;

import java.util.ArrayList;

public class two {
    public static void main(String[] args) {
        ArrayList<text2> list = new ArrayList<>();

        text2 phone1 = new text2("苹果",8999);
        text2 phone2 = new text2("小米",1200);
        text2 phone3 = new text2("华为",2888);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        Food(list);


    }

    private static boolean Food(ArrayList<text2> list){
        for (int i = 0; i < list.size() ; i++) {
            text2 p = list.get(i);
            int price = p.getPrice();
            if (price < 3000){
                System.out.println(p.getBrand() + "." + p.getPrice());
                return true;
            }




        }
        return false;
    }
}
