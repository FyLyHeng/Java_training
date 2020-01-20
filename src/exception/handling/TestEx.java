package exception.handling;

public class TestEx {

    public static class Ex1{
        void msg()throws ArithmeticException, Exception {
            System.out.println("Parent");
        }
    }


    public static class Ex2 extends Ex1{
         //it will error bcos msg() in super class not have Exception
        void msg()throws Exception{
            System.out.println("TestExceptionChild");
        }
    }



}
