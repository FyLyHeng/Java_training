package Inheritances;

public class Vehicle {
    protected String brand = "default";
    protected String vehicleName = "default";
    protected String description = "default";

    /**
     * default constructor
     */
    Vehicle(){ }


    Vehicle(String brand, String vehicleName) {
        this.brand = brand;
        this.vehicleName = vehicleName;
    }

    Vehicle(String brand, String vehicleName, String description){
        this(brand, vehicleName);
        this.description = description;

    }


    /**
     * we have two style to getData
     * for vehicleName and brand are private
     */
    void detailInfo(){
        System.out.println(getBrand());
        System.out.println(getVehicleName());
        System.out.println(getDescription());

    }

    public void printVehicle(){
        System.out.println("Invoked printVehicle");
        System.out.println(this.getBrand());
        System.out.println(this.getVehicleName());
        System.out.println(this.getDescription());
    }



    void output1(){
        System.out.println(brand);
        System.out.println(vehicleName);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String getDescription(){
        return description;
    }

     String getBrand() {
        return brand;
    }

     String getVehicleName() {
        return vehicleName;
    }

     void setBrand(String brand) {
        this.brand = brand;
    }

     void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
