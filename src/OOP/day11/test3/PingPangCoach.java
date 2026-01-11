package OOP.day11.test3;

public class PingPangCoach extends Coach implements English {

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教");

    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学习教英语");

    }
}
