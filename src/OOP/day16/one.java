package OOP.day16;

public class one {
    public static void main(String[] args) {
        int count = 0;      // 统计闰年数量
        int lineCount = 0;  // 当前行已输出的数量

        for (int year = 1949; year <= 2025; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

                System.out.print(year + "\t"); // 输出闰年
                count++;
                lineCount++;

                // 每输出 10 个换一行
                if (lineCount == 10) {
                    System.out.println();
                    lineCount = 0;
                }
            }
        }

        System.out.println("\n总共的闰年数量为：" + count);
    }
}

