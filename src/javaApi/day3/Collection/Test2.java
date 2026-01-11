package javaApi.day3.Collection;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> names = List.of("user1","admin","root123","test","guest9","abc");

        List<String> users = new ArrayList<>();
        for(String n:names){
            if ((n.length() >= 5 && n.matches("^[a-z][a-z0-9]{4,}$"))){
                users.add(n);
            }


        }
        for(String n2:users){
            System.out.println(n2);
        }

    }
}
