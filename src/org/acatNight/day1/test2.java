package org.acatNight.day1;


public class test2 {
    private String brand;
    private String color;
    private int speed;


    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int speed){
        if (speed > 0){
            this.speed = speed;
        }else {
            System.out.println("已低于0，测试无效");
        }

    }
    public double getSpeed(){
        return speed;
    }
    public void showInfo(){
        System.out.println("当前品牌" + brand + "\n" +
                "当前颜色" + color + "\n" +
                "当前速度" + speed);
    }
    public void accelerate(int value){
        this.speed = speed + value;
    }
    public void brake(int value){
        this.speed = speed - value;
    }



}
