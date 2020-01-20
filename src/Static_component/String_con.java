package Static_component;

public class String_con {
    String st1 = "default";
    String st2="default";
    String symbol = "-";


    /**
     This is we call method to constructor
     * default constructor
     * return concatenation method
     */
    String_con(){
        System.out.println("return concatenation\n"+this.concatenation(symbol));
    }

    /**
     * work like con1
     * @param symbol get from main
     */
    String_con(String symbol){
        System.out.println(this.concatenation(symbol));
    }

    /**
     *
     * @param s1
     * @param s2
     */
    String_con(String s1,String s2){
        this.st1 = s1;
        this.st2 = s2;
        System.out.println(this.concatenation(symbol));
    }

    /**
     * constructor with parameter
     * @param s1
     * @param s2
     * @param symbol
     */
    String_con(String s1,String s2,String symbol){
        this.st1 = s1;
        this.st2 = s2;
        System.out.println(this.concatenation(symbol));
    }



    public String concatenation(String plusSing){

        return  st1 + plusSing + st2;
    }

    public static void carInfo(){
        System.out.println("this is car info");
    }
}
