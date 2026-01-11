package javaApi.day2.Object;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",12);
        Student s2 = new Student("zhangsan",12);

        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //如果没有重写equlas方法 那么默认Object方法比较
        //一般地址值对我们来说意义不大 所以我们要重写
    }
}
