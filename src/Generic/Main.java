package Generic;

public class Main {
    public static void main(String[] args) {

        //pass value to class by constructor
        //default constructor
        Generic<Integer> integerGeneric = new Generic<>(12);
        System.out.println(integerGeneric.getT());

        Generic<Double> doubleGeneric = new Generic<>(2.0004);
        System.out.println(doubleGeneric.getT());


        //constructor with parameter
        Generic<String>stringGeneric = new Generic<>("liza");
        System.out.println(stringGeneric.getT());


        //pass value to class by method
        Generic<Float> floatGeneric = new Generic<Float>();
        floatGeneric.add(new Float(10));
        System.out.println(floatGeneric.getT());


        //multiple pass value by constructor
        MultipleType<Integer,String> multipleType = new MultipleType<Integer, String>();
        multipleType.mulitleType(new Integer(70) ,new String("liza"));
        multipleType.getTU();


        //pass value by method and get
        System.out.println("GetT() "+multipleType.getT(new Integer(10)));


        //store value get from Generic by method
        final String u = multipleType.getU();
        System.out.println("Name : "+u);
        }
}
