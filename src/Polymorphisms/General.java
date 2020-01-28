package Polymorphisms;

public class General extends CarInfo {
    General(){
        super();
    }
    private String model="Camry";
    private float price=1000;
    private String color="red";

    @Override
    public void carInfo(){
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
