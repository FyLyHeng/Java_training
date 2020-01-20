package Inheritances;

public class VechileModel extends VehicleType {
    String model = "default";
    String barcode = "default";

    VechileModel(){

    }
    VechileModel(String model, String barcode){
        this.model = model;
        this.barcode = barcode;
    }

    void printModel(){
        System.out.println("Invoked printModel");
        System.out.println(model);
        System.out.println(barcode);
    }

    public void detailInfo(){
        System.out.println("Invoked detailInfo");
        super.detailInfo();
        System.out.println(model);
        System.out.println(barcode);
    }
}
