package nested.classes;

public class OuterClass {
    private int id;
    public String code ;
    private String name;
    public int outer=10;//for inner class 2
//inner class 1
            public class Inner1{
                public String sex;
                private int age;
                public int inner1=10;

                public Inner1(String sex,int age) {
                    this.sex=sex;
                    this.age = age;
                }

                public void output2(){
                    System.out.println(sex);
                    System.out.println(age);
                }

                //this is we can access to outer class
                public int output3(){
                    return id=001;
                }
            }
//inner class 2
            public static class Inner2{
                public int inner2=100;
                public void out(){
                    System.out.println("This is class inner2");
                }
            /*  we cant access to outer class because access level of class is static
                        public int inPutA(){
                            return outer;
                        }
             */

            /*  we cant access to the same inner class
                    public void inner1ToInner2(){
                        System.out.println(inner1);
                    }
             */
                }
//inner class 3
            protected class Inner3{
                public int floor;
                protected float score;

                public void outSore(){
                    System.out.println(score);
                    System.out.println(code);// code from Outer class
                }
                public int getA(){
                    //return outer+inner1; // we can get value from the same inner class
                    return outer;//int outer =10;
                }

                public Inner3(int floor, float score) {
                    this.floor = floor;
                    this.score = score;
                }
}



    public OuterClass(String code, String name) {
        this.code = code;
        this.name=name;
    }
    public void output1(){
        System.out.println(code);
        System.out.println(name);
    }

/*  we cant get propensity from private inner class
    public int getFloor_Inner(){
                return floor;
    }

 */
}
