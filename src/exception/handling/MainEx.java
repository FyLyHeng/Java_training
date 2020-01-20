package exception.handling;

public class MainEx {
    public static void main(String[] args) {

        TestEx.Ex1 myEx1 =new TestEx.Ex1();
        TestEx.Ex2 myEx2 = new TestEx.Ex2();


//        myEx1.msg();// it will error bcos msg() of Ex1 has Ex but main don't
//        myEx2.msg();// it will error bcos msg() of Ex1 has Ex but main don't
// it ok if we use try block to cover it!!
        try {
            myEx1.msg();
            myEx2.msg();
        }catch (Exception e){
            e.getMessage();
        }
    }
}
