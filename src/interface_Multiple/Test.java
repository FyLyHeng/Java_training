package interface_Multiple;

public class Test implements Car,Moto {

    @Override
    public void print() {
        System.out.println("car or Moto");
    }

    @Override
    public void show() {
        System.out.println("show action");

    }
}
