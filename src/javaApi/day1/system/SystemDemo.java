package javaApi.day1.system;

public class SystemDemo {
    public static void main(String[] args) {
        //方法的形参;
        //状态码:
        //0 正常运行;
        //非0 告诉虚拟机当前是异常停止

//        System.exit(0);
//        System.out.println("看看我执行了吗");
        //当拼图小游戏为例子
        //当我们需要程序结束时 就可以调用这个方法
        //long l = System.currentTimeMillis();
        //System.out.println(l);
        //就是获取程序运行的总时间
        //end - start

        //拷贝数组
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = new int[10];
                         //拷贝的数组  位置  要粘贴的位置 位置 个数
//        System.arraycopy(arr1,0,arr2,0,5);
//
//        for(int i =0;i<=arr2.length;i++){
//            System.out.println(arr2[i]);
//        }
//        System.arraycopy(arr1,0,arr2,4,3);
        System.arraycopy(arr1,6,arr2,2,3);
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }


    }
}
