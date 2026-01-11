package javaApi.day2.Regex;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        String telephone = "13712355213";
        telephone.matches("^1[3-9]\\d{9}$");

        String[] data = {
                "2206739445",
                "012345",
                "abc123",
                "123456",
                "99887766",
                "10001",
                "qq888888",
                "7654321",
                "0000000"
        };
        List<String> qqList = new ArrayList<>();

        for (int i = 0; i < data.length ; i++) {
            if (data[i].matches("^[1-9]\\d{5,19}$")){
                qqList.add(data[i]);

            }
        }

        System.out.println("合法QQ：");
        for (String qq : qqList) {
            System.out.println(qq);
        }

    }
}
