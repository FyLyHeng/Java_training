package Encapsulation_Set_Get;

public class Main {
    public static void main(String[] args) {
        Encap_Class myEncap=new Encap_Class();
        System.out.println("set by setMethod");
        myEncap.setName("Liza kok");
        myEncap.setEmail("kok.liza@gmail.com");
        myEncap.setAge(18);

        System.out.println("get value by getMethod");
        System.out.println(myEncap.getName());
        System.out.println(myEncap.getEmail());
        System.out.println(myEncap.getAge());

        System.out.println("=========================");

        System.out.println("set value by constructor");
        myEncap=new Encap_Class("kokJM","JM.kok@gmail.com",20);

        System.out.println("get by method toString");
        System.out.println(myEncap.toString());
        myEncap.outPrivate();
    }
}
