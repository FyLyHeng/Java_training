package exceptionAdvance;

 public  class Test {
     /**
      * this is static class
      * we use throws with static method
      * @throws Exception
      */
    static void msg() throws Exception {

        System.out.print("This is throws Exception with method");
        throw new Exception("this is throws error");

    }
    float setValue(int value1 , float value2){
        return value1+value2;
    }
}
