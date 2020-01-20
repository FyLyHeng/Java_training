package Final_access;

public class Final_method {
    final void methodOne(){
        System.out.println("This is void final method");
    }
    void methodOne(int a){
        System.out.println("We can override on final method");
        a+=5;
    }
}
