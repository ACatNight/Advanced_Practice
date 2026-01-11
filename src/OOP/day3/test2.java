package OOP.day3;

public class test2 {
    public test2(){

    }

    public  void getAerage(int[] number){

        int sum = 0;
        int Arr = 0;
        for (int i = 0; i < number.length ; i++) {
            sum = sum + number[i];
            Arr = sum / number.length;
        }

        System.out.println("平均值为:" + Arr);


    }
}
