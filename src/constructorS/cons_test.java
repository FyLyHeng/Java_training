package constructorS;

public class cons_test {
    int a;
    float x;
    String fx="";
    //default constructor
    public cons_test() {
        a=10;
        x=25f;
        fx="100d";
    }
    //constructor with parameter

    public cons_test(int a, float x) {
        this.a = a;
        this.x = x;
    }
    //copy constructor
    public cons_test(cons_test copy){
        a=copy.a;
        x=copy.x;
        fx=copy.fx;
    }

    public void out(){
        System.out.println(a);
        System.out.println(x);
        System.out.println(fx);
    }
//override on method toString
//https://www.youtube.com/watch?v=nElpWeUnbmU&t=2655s
    @Override
    public String toString() {
        //return super.toString();
        return a+"\n"+x+"\n"+fx;
    }
}
