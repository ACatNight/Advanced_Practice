package org.acatNight.day2;

public class text2 {
    private String brand;
    private int price;

    public text2(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
