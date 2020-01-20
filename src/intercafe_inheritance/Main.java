package intercafe_inheritance;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        test.message();
        test.show();

        /**
         * call static method from Motor (interface)
         * set value 2 to method
         */
        int sum = Motor.sum(2);
        System.out.println(sum+" this is sum that set value by main");


        /**
         * call static method from Motor (interface)
         */
        Motor.hello();


        /**
         * call print() from Test class
         * and print was Override ready
         * print return Motor.sum()
         */
        test.print();



    }
}
