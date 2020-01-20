package Polymorphisms.overloading;

public class OverloadingPromotion {


    /**
     * simple overloading method
     * Promotion Type
     * @param a
     */
    public void sub(int a){
        System.out.println(a);
    }

    public void sub(int a,int b){
        System.out.println(a+b);
    }

    public void sub(int a,float b){
        System.out.println(a+b);
    }


    /**
     * overloading method
     * @param a
     * @param b
     */
    void sum(int a, int b){
        System.out.println("int invoked");
    }

    void sum(long a , long b){
        System.out.println("long invoked");
    }



    /**
     * Promotion OverloadingReturnType
     */

    void add(int a, long b){
        System.out.println("int - long invoked");
    }


    void add(long x, int y){
        System.out.println("long - int invoked");
    }


}
