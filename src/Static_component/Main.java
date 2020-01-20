package Static_component;

import static Static_component.Static_con.ShowScore;

public class Main {
    static {
        System.out.println("This is BTB Boy");
    }
    public static void main(String[] args) {

        /**
         * when we create obj static block in class Static work
         */
        Static_con myObj=new Static_con();
        myObj.OutInfo();
        ShowScore();


        // it incress one the call S
        Static_counter c1=new Static_counter();     //1
        Static_counter c2=new Static_counter();     //2
        Static_counter c3=new Static_counter();     //3
        System.out.println("====================================");


        /**
         * work with String_con Constructor
         * symbol will call static var with value ("-")
         */
        String_con con = new String_con("kok","liza");
        String_con con1 = new String_con("bobo","vetnak");
        String_con con2 = new String_con("seang","ezx");


        /**
         * call method
         */
        String format = con.concatenation("/");
        System.out.println(format);


        /**
         * call static method
         */
        String_con.carInfo();
        Static_con.bVoid();
        System.out.println("---------------------------------");

        /**
         * work with ThisAccess keyword
         */
        ThisAccess thisAccess = new ThisAccess(2);
        //ThisAccess thisAccess1 = new ThisAccess(2,3);
        ThisAccess thisAccess2 = new ThisAccess();


        /**
         * work with ThisWithCon_realUse
         */
        System.out.println("\n\n===____ThisWithCon_realUse____====");
        ThisWithCon_realUse thisWithCon_realUse = new ThisWithCon_realUse(01l,"liza","driver","12/12/2012",100l);

        thisWithCon_realUse.printAll();


        /**
         * work with Test
         * constructor invoked PrintData()
         */              
        Test test  =new Test();

        new Return_this().msg();
        System.out.println(new Return_this().a);


        System.out.println(new Return_this().getReturnThis());

        Return_this returnData = new Return_this();

        System.out.println(returnData);


    }
}
