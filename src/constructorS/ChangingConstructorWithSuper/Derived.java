package constructorS.ChangingConstructorWithSuper;

public class Derived extends Base{

    Derived(){
        System.out.println("No-argument constructor of Derived");
    }

    Derived(String name){

        // call constructor with 1 parameter of Parent class
        super(name);
        System.out.println("Call parameterized constructor of Derived");
    }
}
