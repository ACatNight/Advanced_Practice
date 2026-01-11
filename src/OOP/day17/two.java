package OOP.day17;

public class two {
    public static void main(String[] args) {
        int apples = 2;
        int dayCount = 0;
        int totalApple = 0;
        double totalMoney = 0;

        while (totalApple <= 100){
            dayCount++;
            totalApple += apples;
            totalMoney += apples * 1.2;

            apples *= 2;
        }
        double avgMoney = totalMoney / dayCount;
        System.out.println("消耗了" + dayCount + "天");
        System.out.println("苹果平均的钱" + avgMoney);

    }
}
