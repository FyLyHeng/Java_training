package Polymorphisms.overloading.MethodSignature;

public class Main {
    public static void main(String[] args) {

        SignatureClass signatureClass = new SignatureClass();

        signatureClass.setMapReference(10,10);

        signatureClass.setMapReference(signatureClass);

    }
}
