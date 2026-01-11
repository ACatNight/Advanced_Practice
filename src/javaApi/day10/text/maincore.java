package javaApi.day10.text;

public class maincore {
    public static void main(String[] args) {
        School school = new School();
        Classroom class1 = new Classroom("一班");
        school.addClassroom(class1);

        while (true){
            System.out.println("1·添加学生");
            System.out.println("2·查看班级");
            System.out.println("3·按学号查询");
            System.out.println("4·查看排名");
            System.out.println("5·查看单科排名");
            System.out.println("6·不及格榜单");
            System.out.println("7·退出");
            System.out.println("8·查看不及格率");
            int Choose = Util.inputInt();
            switch (Choose){
                case 1:
                    class1.addStudentWithInput(); // 只调方法
                    break;
                case 2:
                    school.printAll();
                    break;
                case 3:
                    class1.queryStudent();

                    break;
                case 4:
                    class1.printRankByTotalScore();
                    break;

                case 5:
                    class1.printRankBySubject();
                    break;
                case 6:
                    class1.printFailRankBySubject();
                case 7:
                    System.out.println("退出系统");
                    break;
                case 8:
                    class1.printFailRateSubject();
                    break;

        }
    }
}
}