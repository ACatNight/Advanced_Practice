package OOP.day13.test2;

public class School {
    public  void starClass(){
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.name = "小毛";
        teacher.name = "老毛";

        teacher.teach(student);
        student.study();
    }
    public class Student{
        String name;
        public void study(){
            System.out.println("学生" + name + "正在学习");
        }
    }
    public class Teacher{
        String name;
        public void teach(Student s){
            System.out.println("老师" + name + "正在教" + s.name);
        }
    }
}
