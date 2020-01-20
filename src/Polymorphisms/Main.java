package Polymorphisms;

public class Main {
    public static void main(String[] args) {
        CarInfo myCar=new CarInfo();
        CarInfo myMac=new Machine();
        CarInfo myGen=new General();

        myCar.carInfo();
        myMac.carInfo();
        myGen.carInfo();

    }
}
