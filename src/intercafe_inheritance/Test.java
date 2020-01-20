package intercafe_inheritance;

public class Test implements Motor {

    @Override
    public void out() {

    }

    @Override
    public void message() {
        System.out.println("message");

    }

    @Override
    public void show() {
        Motor.motorInfo();
        System.out.println("__---__--- list all motor info");

    }

    /**
     * override print from Car interface
     * Call static method from Motor
     */
    @Override
    public void print() {

        System.out.println(Motor.sum(3)+" this is sum set value by TestClass");

    }





}
