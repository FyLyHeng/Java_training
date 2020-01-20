package Polymorphisms.overriding;

public class Main {
    public static void main(String[] args)  {


        //gable variable
        int a[]={1,2,3,4,5,6};
        long b[]={1,2,3,4,5,6};

        //create obj super class
        Overriding overriding = new Overriding();

        /**
         * add() have throws exception
         */
//        int re = overriding.add(a,4);
//        System.out.println("this is sum of arg a[] = "+re);


        /**
         * work with subclass
         */
        SubOver sub = new SubOver();
        sub.sum();

        /**
         * we can use add() without throw exception
         * by override in child class
         * call that override method
         */
        long res = sub.add(a,3);
        System.out.println("invoked add(exception optional) " +res);
        String str = sub.add(b,3);


        /**
         * work with static
         */

        SubOver.getInfo();
        //sub.getInfo(); //warring statement

    }
}
