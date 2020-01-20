package Polymorphisms.overloading;

public class OverloadingReturnType {

    /**
     * return type method
     * @return
     */
    public int add(){
        int a=2;
        return a;
    }
    public int add(int a){
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }


    /**
     * compile time error
     * Params is the same
     * ReturnType error
     * we cant overload method at int same parameter
     * java will not sure with one to invoked
     * @param a
     * @return
     */
    public int plus(int a){
        return a;
    }

//    public double plus(int a){
//        return a;
//    }


    /**
     * it not depend on returnType
     * params is ont match int work
     * @param a
     * @param b
     * @return
     */
    int sub(int a, int b){
        return 1;
    }

    long sub(int a, long b){
        return 2;
    }

    long sub(long a, int b){
        return 3;
    }


    /**
     * What is method hiding in Java?
     * override in StaticMethod class
     */
    public void foo() {
        System.out.println("Animal");
    }

}
