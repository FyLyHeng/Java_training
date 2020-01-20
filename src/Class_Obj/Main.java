package Class_Obj;

public class Main {
    public static void main(String[] args) {
        test1 myObj=new test1();
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println("===============");
        //override x and y (set 10 to x)
        myObj.x=10;
        System.out.println(myObj.x);
//        try {
//            throw  myObj.y=30;
//        }catch (Exception e){
//            System.out.println("something error");
//        }
        /* myObj.y=30; //it will be error because y is final variable */
        System.out.println(myObj.y);
    }
}
