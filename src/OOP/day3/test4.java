package OOP.day3;

import java.util.ArrayList;

public class test4 {
    private test4() {

    }
    public static void FoundMax(ArrayList<test3> list){
        int Max = 0;
        for (int i = 0; i < list.size() ; i++) {
           Max = list.get(0).getAge();
           if (Max < list.get(i).getAge()){
               Max = list.get(i).getAge();
           }


        }
        System.out.println(Max);


    }


}
