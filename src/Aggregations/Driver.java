package Aggregations;

public class Driver {
    int id;
    String name;
    String idCard;
    Address address;

    Driver(int id,String name,String idCard , Address address){
        this.id = id;
        this.name = name;
        this.idCard = idCard;
        this.address = address;

    }


    void display(){
        System.out.println(id+" "+name+"  "+idCard);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}
