package Class_Obj;

public class Main01 {
    public static void main(String[] args) {
        test1 myObj=new test1();
        test1 myObj1=new test1();
        myObj1.x=30;
        System.out.println(myObj.x);
        System.out.println(myObj1.x);// x of myObj is not affect
    }
}
