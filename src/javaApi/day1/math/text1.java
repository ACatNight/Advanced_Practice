package javaApi.day1.math;
public class text1 {
    public static void main(String[] args) {
        System.out.println(isPrime(31));


    }

    public static boolean isPrime(int n) {
        int count = 0;//循环几次
        for (int i = 2; i <= Math.sqrt(n); i++) {
            count++;
            if(n % i == 0){ //如果n和i 整除为0 那就不是
                return false;
            }


        }
        System.out.println(count);
        return true;
    }

}
