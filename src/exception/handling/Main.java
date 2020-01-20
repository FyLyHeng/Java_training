package exception.handling;

public class Main {
    public static void main(String[] args) {
        Try_catch myTC=new Try_catch();
        myTC.tryCatchBlock();
        System.out.println("========Nest Try catch============");
        myTC.nestTryCatch();
        System.out.println("=====Multi catch in try block=====");
        myTC.multiCatchBlock();
        System.out.println("==========Finally block============");
        myTC.finallyBlock();
        System.out.println("===================================");
        myTC.finallyBlock1();
        System.out.println("===================================\n");
        myTC.throwEX();
        System.out.println("===================================\n");
        myTC.p();
        System.out.println("===================================\n");
        System.out.println();
        Main01 myMain=new Main01();
        myMain=null;
        System.gc();


    }
}
