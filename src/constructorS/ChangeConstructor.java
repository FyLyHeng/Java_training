package constructorS;

public class ChangeConstructor {

    ChangeConstructor(){
        this(5);
        System.out.println("Default constructor");
    }

    private ChangeConstructor(int x){
        this(5,15);
        System.out.println(x);
    }

    private ChangeConstructor(int x, int y){
        System.out.println(x*y);
    }
}
