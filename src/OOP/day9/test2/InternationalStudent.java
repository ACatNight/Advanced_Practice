package OOP.day9.test2;

public class InternationalStudent extends Graduate {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void showDetail() {
        System.out.println("[留学生] \t 姓名:" + getName() + "年龄:" + getAge() + "学号:" + getId() + "国家" + getCountry());
        super.showDetail();
    }
}
