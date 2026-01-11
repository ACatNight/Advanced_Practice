package javaApi.day1.regex;
public class text1 {
    public static void main(String[] args) {
        String telephone = "13712345667";
        //1开头 3-9区间  任何一个数字
        System.out.println(telephone.matches("1[3-9]\\d{9}"));
        String homeTelephone = "020-2324242";
        //开头是0
        //任何1个数字 在第二个-第三个范围 然后 要有一次或0次 -? 最后任何一个数字数字4-9
        System.out.println(homeTelephone.matches("0\\d{2,3}-?[1-9]\\d{4,9}"));
        String email1 = "3232323@qq.com";
        System.out.println(email1.matches("\\w+@[\\w && [^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}"));
        String name = "Mournic";
        System.out.println(name.matches("\\w{4,16}"));
        String id = "41080119930228457x";
        System.out.println(id.matches("[1-9]\\d{16}[\\dXx]"));
        //任何字母 + 一个@ 不少于6个
        // 大写字母和小写字母 都可以
        // 只可以出现2-3次
        // {1.2）就是这一组 可以出现1-2次
        //\\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}
    }
}
