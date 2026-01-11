package OOP.day17;

public class one {
    public static void main(String[] args) {
        int sum = 0;
        int flag = 1;

        for (int i = 1; i <= 101 ; i += 2) {
            sum += flag * i;
            flag = -flag;
        }

        System.out.println(sum);
    }
}
