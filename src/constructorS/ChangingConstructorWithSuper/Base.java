package constructorS.ChangingConstructorWithSuper;

public class Base {
    String string;

    Base(){
        this("");
        System.out.println("No-argument constructor of this class");
    }

    Base(String string){
        this.string = string;
        System.out.println("Calling parameterized constructor of This class");
    }
}
