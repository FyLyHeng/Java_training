package Abstracts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class reader implements Inter1 {
     String id = "001";

    /**
     * get age from Interface class
     */
    double myAge = age;

    /**
     * Override Interface method
     */
    @Override
     public void input(){
        System.out.println("this is input");
     }

     @Override
     public void output(){
          System.out.println("Student id "+id+" age is "+myAge);
          DateIn();
     }

     @Override
     public void show() {

    }


    /**
     * local method
     */
    public void DateIn(){
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final Date date = new Date();
        System.out.println("DateOut = "+date);
    }
    public void demo(){
        System.out.println("Student id "+id);
        DateIn();
     }



}
