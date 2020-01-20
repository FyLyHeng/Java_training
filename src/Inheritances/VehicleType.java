package Inheritances;

public class VehicleType extends Vehicle {
     int year = 0;
     String code = "default";
     String typeName ="default";
     int availableSit = 0;

    /**
     * constructor
     */
    public VehicleType(){}

    /**
     * constructor with parameter
     * @param brand
     * @param model
     * @param year
     * @param code
     */
     VehicleType(String brand, String model, int year, String code) {

        /**
         * call method from Vehicle
         * super.setBrand(brand)
         * super.setVehicleName(vehicleName)
         */
        setBrand(brand);
        setVehicleName(model);
        this.vehicleName =model;
        this.brand=brand;
        this.year = year;
        this.code = code;
    }

    /**
     * constructor with parameter
     * this is we invoked by constructor of super class
     */
     VehicleType(String brand, String model, String description , int year, String code) {
        super(brand, model,description);
        this.year = year;
        this.code = code;
    }


    /**
     *
     */
    VehicleType(String typeName,int year,String code,int availableSit){
        this.typeName = typeName;
        this.year = year;
        this.code = code;
        this.availableSit = availableSit;
    }
    /**
     * this is invoked by method of super class
     */

    public void detailInfo(){
        super.detailInfo();
        System.out.println(typeName);
        System.out.println(code);
        System.out.println(year);
        System.out.println(availableSit);
    }

    public void printType(){
        System.out.println("Invoked printType");
        System.out.println(typeName);
        System.out.println(year);
        System.out.println(code);
        System.out.println(availableSit);

    }



}

