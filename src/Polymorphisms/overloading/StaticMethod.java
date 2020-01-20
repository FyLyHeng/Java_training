package Polymorphisms.overloading;

public class StaticMethod extends OverloadingReturnType{


    /**
     * promotionType
     * @param a
     * @param b
     */
    public static void display(int a, long b){
        System.out.println("invoked display (int , long)");
    }

    public static void display(long a, int b){
        System.out.println("invoked display (long , int)");
    }


    /**
     * ReturnType
     */

    public static double find(int a){
        return a;
    }

    public static int find (long a, int b){
        return 0 ;
    }

    public static int find (int a, long b){
        return 1;
    }




    /**
     * returnType
     * test with error
     */

    public static int operation(){
        return 0;
    }

//    public static long operation(){
//        return 1;
//    }

    public static long operation(int a){
        return a;
    }


//    public static int operation(int a){
//        return a;
//    }

    public static int operation(int a , long b){
        return 2;
    }

//    public static long operation(int a, long b){
//        return 3;
//    }


    /**
     * What is method hiding in Java?
     *
     * override foo from OverloadingReturnType class
     * hides Animal.foo()
     * it call hides method
     */
    @Override
    public void foo() {
        System.out.println("Cat");
    }

}
