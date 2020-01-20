package Inheritances;

public class Main {
    public static void main(String[] args) {

        /**
         * constructor set value to properties success
         * but constructor have no statement to print it
         */
        //VehicleType myVehicleType = new VehicleType("Ford","Mustang",2019,"B001");



        //myVehicleType.detailInfo();

        System.out.println("=======================");
        //VehicleType vehicleType = new VehicleType("Lamborghini","Hurechon","limit edition",2020,"AC001");
        VehicleType vehicleType = new VehicleType("Ven",2020,"Black",4);

        vehicleType.detailInfo();


        System.out.println(vehicleType.code);

        System.out.println("==========Vehicle=============");
        /**
         * work with Vehicle
         * we can point to all of hierarchy
         */
        VechileModel vechileModel = new VechileModel();

        System.out.println(vechileModel.code);

        vechileModel.printType();
        //vechileModel.detailInfo();
    }
}
