package Abstracts;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {

        /**
         * abstract
         * constructor of abstract work when use that class (person) as pointer
         * point to student(child)
         */
        person person = new student();
        person.DateIn();


        /**
         * interface
         * obj1 pointer type is Interface
         * can point to subClass
         * point to reader
         */
        Inter1 obj1 = new reader();
        obj1.output();

        /**
         * access to class reader
         */
        System.out.println("Age is "+((reader) obj1).myAge); // obj1.myAge
        System.out.println("Age is "+reader.age +" by static access");
        System.out.println("=============================");


        /**
         * point to student
         */
        obj1 =new student("liza","female","",1);
        //obj1 = new student();
        obj1.output();
        System.out.println("1=============================");


        /**
         * point to Teacher
         * pass value LIZA to teacher by constructor
         */
        obj1 = new Teacher("Liza");
        obj1.output();

    }
}
