package intercafe_inheritance;

public interface Motor extends Car {
    void out();
    void message();
    static int sum(int a){return a*a*a;}

    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }

    static void motorInfo(){
        System.out.println("test motor Interface");
    }

}
