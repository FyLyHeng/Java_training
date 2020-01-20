package exceptionAdvance;

public class Main {

    /**
     * msg() has Throws Exception
     * Class Main must to throws exception
     * @throws Exception
     */

    public static void main(String[] args)throws Exception {


        // Test.msg();
        //SubTest.msg();
        SubTest subTest = new SubTest(1);
        SubTest subTest1 = new SubTest(1);
        float result = subTest.setValue(0);
        System.out.println(result);


    }
}