package SingleTon;

public class Main01 {
    public static void main(String[] args) {
        SingleTon01 text = SingleTon01.singleTon01();
        SingleTon01 text01 = SingleTon01.singleTon01();


        text.str = (text.str).toUpperCase();

        System.out.println("String in Upper case"+text.str+"\n");


        text01.str = (text01.str).toLowerCase();
        System.out.println("String in lower case is "+text01.str);
    }
}
