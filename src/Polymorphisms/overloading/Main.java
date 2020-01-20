package Polymorphisms.overloading;

public class Main {
    public static void main(String[] args) {
        //this is new comment

        /**
         * work with ReturnType
         */
        OverloadingReturnType returnType = new OverloadingReturnType();

        System.out.println("invoked sub(int , long) "+returnType.sub(10,10L));

        System.out.println("invoked sub(long , int) "+returnType.sub(10L,10));

        System.out.println("invoked plus(int) " + returnType.plus(10));


        /**
         * work with promotionType
         */
        OverloadingPromotion promotion = new OverloadingPromotion();

        promotion.sum(10,10);
        promotion.add(10, 10L);
        promotion.add(10L,10);


        /**
         * work with static method (overloading)
         * promotionType
         */
        StaticMethod.display(10,10L);
        StaticMethod.display(10L,10);


        /**
         * work with static method (overloading)
         * return Type ()
         */
        System.out.println("invoked operation(int) "+StaticMethod.operation(1));
        System.out.println("invoked operation(int , long) "+StaticMethod.operation(10,10L));

        System.out.println("invoked find(int) "+StaticMethod.find(10,10L));
        System.out.println("invoked operation(int) "+StaticMethod.find(10L,10));


        /**
         * work with hides method
         * too fun
         */
        StaticMethod method = new StaticMethod();
        method.foo();
    }
}
