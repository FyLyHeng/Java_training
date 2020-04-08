package Interfaces;
/**
 * VehicleType implement from Inter1(interface)
 * this class extend from VehicleType(base)
 * so have not override all of method in VehicleType
 * and we can use all of method in VehicleType and Inter1
 */

public class Sub1 extends Sub {


    //override print it will hide print in base class
    @Override
    public void print(){
        System.out.println("print from sub1");
    }


    /*
    @Override
    public void show(){

    }*/

    @Override
    void showSub(){
        System.out.println("showSub in sub1");
        System.out.println("can add more deference");

    }
}
