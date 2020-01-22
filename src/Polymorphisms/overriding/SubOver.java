package Polymorphisms.overriding;

public class SubOver extends Overriding{


//    @Override
//    void sum() {
//        super.sum();
//        System.out.println("and override sum()");
//    }

    /**
     * override method with exception
     * add()
     * throw is optional
     * it we throws exception when call to main need to throws
     */

//    @Override
//    int addInfo(int[] a, int b) throws Exception {
//        super.addInfo(a,b);
//        int res = 0;
//        for (int sum : a){
//            res += sum+b;
//        }
//        return res + b;
//    }

    /**
     * superMethod have throws exception
     * but it optional
     * @param a
     * @param b
     * @return
     */
//    @Override
//    int add(int[] a, int b)  {
//        //return super.add(a, b);
//        int res = 0;
//        for (int sum : a){
//            res += sum + b;
//        }
//        return res;
//    }


    /**
     * superMethod don't have exception
     * cant use exception at child
     * @param a
     * @param b
     * @return
     * @throws Exception
     */


    @Override
    String add(long[] a, int b) //throws Exception
     {
        //super.add(a, b);
        System.out.println("invoked String add(x)");
        //return super.add(a,b);
        return null;
     }


    void print(){
        System.out.println("child");
    }




    /**
     * work with static method
     * super.getInfo() not work because it is static method
     * err = print statement to console at first with red color
     * this is not override getInfo()-super
     * it call getInfo()-super into subclass
     */

//    public static void getInfo(){
//        //super.getInfo();
//        Overriding.getInfo();
//        System.err.println("invoked getInfo() from SubClass");
//    }


}
