package Polymorphisms.overriding;

public class Overriding {

    void sum() {
        System.out.println("invoked sum() of superClass");
    }

    /**
     * method with throws exception
     * child have not to throws
     * but if we call to main we must to throws Exception with class
     * @param a
     * @param b
     * @return
     * @throws Exception
     */
    int add(int a[], int b) throws Exception {
        int max = 0;

        for (int z : a) {
            max += z;
        }
        return max;
    }


    int addInfo(int[] a, int b) throws Exception {
        //return super.add(a, b);
        int res = 0;
        for (int sum : a){
            res += sum;
        }
        return res;
    }


    String add(long[] a, int b) {
        long max = 0L;
        String string = "";

        for(long str : a){
            string += str;
        }
        return string;
    }


    /**
     * work with static method
     * non throws Exception
     */
    public static void getInfo(){
        System.out.println("invoked getInfo() from Super Class");
    }


}
