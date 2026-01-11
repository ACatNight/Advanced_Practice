package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("admin");
      list.add("root");
      list.add("user123");
      list.add("test");
      list.add("admin1");

      List<String> users = new ArrayList<>();

      for(String u:list){
          if (u.length() >=5 && u.matches(".*\\d.*")){
              users.add(u);
          }
      }
        for(String us:users){
            System.out.println(us);
        }
    }
}
