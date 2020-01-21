package nested.classes;

public class Main {
    public static void main(String[] args) {
        OuterClass myOut=new OuterClass("01B3","kok");
        OuterClass.Inner1 myIn=myOut.new Inner1("f",20);

        System.out.println("==============Inner1==================\n");
        System.out.println(myIn.output3());
        myOut.output1();
        myIn.output2();

        System.out.println("==============Inner2==================\n");
        OuterClass.Inner2 myIn2=new OuterClass.Inner2();
        myIn2.out();
        System.out.println(myIn2.inner2);

        System.out.println("===============Inner3=================\n");
        OuterClass.Inner3 myIn3=myOut.new Inner3(1,70);
        System.out.println(myIn3.floor);
        myIn3.outSore();


        System.out.println("=============InnerStatic==============");
        OutClass.NestedStatic aStatic = new OutClass.NestedStatic();
        aStatic.message();


        /**
         * create obj inner non-static class option1
         * 1-create obj of OutClass
         * 2-create obj of InnerClass by using obj class Out for reference to point to Inner class
         */
        System.out.println("============InnerNonStatic=============option1");
        OutClass outClass = new OutClass();
        OutClass.NestedNonStatic nonStatic = outClass.new NestedNonStatic();

        System.out.println(outClass.numberOfTest+" call number from Outclass");// using data member of class Out
        nonStatic.display(); // call Inner non-static class


        /**
         * create obj inner non-static class option2
         * this is way we have no way to access to OutClass
         * because obj is NestedClass's
         */
        System.out.println("============InnerNonStatic=============option2\n");
        OutClass.NestedNonStatic nestedNonStatic = new OutClass().new NestedNonStatic();
        nestedNonStatic.display();


    }
}
