package SingleTon;

public class Main {
    public static void main(String[] args) {

        /**
         * create obj of SingleTonClass
         * getInstance() is method return SingleTonInstance
         * that SingleTon is Static Class
         */
        SingleTon ton =  SingleTon.getInstance();


        // we change
        ton.str = (ton.str).toUpperCase();
        System.out.println(ton.str.getClass());



        SingleTon ton1 = SingleTon.getInstance();
        System.out.println(ton1.str.toLowerCase());

    }
}
