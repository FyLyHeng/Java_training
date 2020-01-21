package constructorS;

public class Main {
    public static void main(String[] args) {
        cons_test myCon=new cons_test();

        //output default constructor
        System.out.println("===========default==============");
        myCon.out();

        //call constructor with parameter
        System.out.println("============con with parameter=============");
        cons_test myCon_withParameter=new cons_test(10,50f);

        //output by .toString();
        System.out.println(myCon_withParameter);

        //call copy constructor
        System.out.println("============copy==============");
        cons_test myCopy=new cons_test(myCon);
        System.out.println(myCopy);


        //call overloading constructor
        System.out.println("===========overloading con=======");
        ConsOverloading overloading = new ConsOverloading(10,20,30);
        ConsOverloading overloading1 =new ConsOverloading(5);
        ConsOverloading overloading2=new ConsOverloading();

        double value;

        value = overloading.valume();
        System.out.println("invoked con(d,d,d) "+value);
    }
}
