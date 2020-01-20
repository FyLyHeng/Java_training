package Static_component;

/**
 * we can call constructor into constructor
 */
public class ThisAccess {
    int value = 10;
    String key = "store";

    /**
     * default con
     * @param a
     */
//    ThisAccess(){
//        System.out.println("invoked constructor");
//    }


    /**
     * with params
     * @param a
     */
    ThisAccess(int a){
    //this();
        System.out.println("invoked out constructor with params  " +a);
    }

    ThisAccess(int a, int b){
        this(1);
        System.out.println("this is invoked con with two params is A is "+a+" B is "+b);
    }

    ThisAccess(){
        this(2,3); //call con with 2 params
        System.out.println("invoked constructor");
    }
}
