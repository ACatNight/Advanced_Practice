package OOP.day15;

import java.util.Random;

public class day15 {
    public static void main(String[] args) {

        //把一个一维数组的数据 0-15 打乱顺序
        //然后4个一组 添加二维数组
        //1 定义一个一维
        int [] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2打乱
        //遍历数组 得到每一个元素 拿着每一个元素跟随机索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length ; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //创建一个2维数组
        int[][] data = new int [4][4];
        //给二维数组添加数据
        //解法1 便利temparr 得到每一个元素 一次加入数组当中
        for (int i = 0; i < tempArr.length ; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
