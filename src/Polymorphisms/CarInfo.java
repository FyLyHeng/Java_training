package Polymorphisms;

public class CarInfo {
    private String brand="Toyota";
    private String year="2017";

    public void carInfo(){
        System.out.println(brand);
        System.out.println(year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
