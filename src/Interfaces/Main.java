package Interfaces;

public class Main {
    public static void main(String[] args) {

        /**
         * if we create obj from Interface we need to override all method of Inter1
         * stupid way
         */
        //Inter1 min = new Inter1();

        /**
         * create obj of Class sub1()
         * use pointer is Inter1
         * print() is from Sub1
         */

        //this is test git
        Inter1 muin = new Sub1();
        muin.print();
        System.out.println("=========================1");


        /**
         * use pointer VehicleType(base)
         * create obj of class Sub1(child)
         */
        Sub subSub1 = new Sub1();
        subSub1.print();
        System.out.println("=========================2");



        /**
         * we cant use sub1(child) point to VehicleType(base)
         * but we can user VehicleType(base) point to Sub1(child)
         * and properties that can dot is from Sub1()
         */
        //sub1 sub1Sub = new VehicleType(); // error statement
        Sub subSub2 = new Sub1();
        subSub2.print(); //print from Sub1
        System.out.println("========================= work with Sub1");


        /**
         * create obj of class VehicleType()
         *
         */
        Sub sub = new Sub();
        sub.print();
        sub.show();
        sub.showSub();


        System.out.println(("---------------------------------------"));
        /**
         * create obj Sub1(child)
         * show is from sub because Sub1 have on Override show
         * print is from Sub1 because Sub1 have Override print
         * showSub from sub1
         */
        Sub1 sub1 = new Sub1();
        sub1.show();
        sub1.print();
        sub1.showSub();



    }
}
