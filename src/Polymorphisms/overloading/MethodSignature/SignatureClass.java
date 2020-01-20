package Polymorphisms.overloading.MethodSignature;

public class SignatureClass {

    SignatureClass(){}


    SignatureClass(int a){

    }
    SignatureClass(int a,int b){
        this(1);
    }

    public int setMapReference(int x, int y) {
        System.out.println("invoked setMapping"+x+y);
        return x;
    }


    public void setMapReference(SignatureClass point){
        System.out.println("testing"+point);

    }
}
