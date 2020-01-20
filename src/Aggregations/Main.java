package Aggregations;

public class Main {
    public static void main(String[] args) {

        Address address1=new Address("bodia","PP","Ps");
        Address address2=new Address("bodia","SR","Sp");

        Driver driver = new Driver(1,"Liza","002214738129",address2);
        driver.display();

    }
}
