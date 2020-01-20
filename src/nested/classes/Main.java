package nested.classes;

public class Main {
    public static void main(String[] args) {
        OuterClass myOut=new OuterClass("01B3","kok");
        OuterClass.Inner1 myIn=myOut.new Inner1("f",20);

        System.out.println("==============Inner1==================");
        System.out.println(myIn.output3());
        myOut.output1();
        myIn.output2();

        System.out.println("==============Inner2==================");
        OuterClass.Inner2 myIn2=new OuterClass.Inner2();
        myIn2.out();
        System.out.println(myIn2.inner2);

        System.out.println("===============Inner3=================");
        OuterClass.Inner3 myIn3=myOut.new Inner3(1,70);
        System.out.println(myIn3.floor);
        myIn3.outSore();


    }
}
