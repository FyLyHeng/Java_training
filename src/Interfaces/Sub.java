package Interfaces;

/**
 * this class implement from Class Interface dearest
 * need to override all method in Inter1
 */
public class Sub implements Inter1{

    /**
     * this method is
     * override from Inter1
     * implement by SubClass is Sub1
     */
    @Override
    public void print(){
        System.out.println("print from VehicleType");
    }

    @Override
    public void show() {
        System.out.println("show from VehicleType");

    }
    void showSub(){
        System.out.println(("ShowSub in VehicleType"));

    }

}
