package regex;

public class Main {

    public static void main(String[] args) {
        Regexp myReg=new Regexp();
        myReg.way1Dote("xx","AxxS");
        myReg.way2Dote("aa","zaZ");// .aa and _aZ => false
        myReg.way3Dote("zz","AZz");// .zz and _Zz => false
        System.out.println("=================================================");

        myReg.Regular("KoK","o");   //K, o, or K if have one of them => true


        //? once time or not
        myReg.quantifierQes("Phnom","");// => true
        myReg.quantifierQes("Phnom","P");//=> true
        myReg.quantifierQes("Phnom","x");// x not found => false
        myReg.quantifierQes("Phnom","nn");// => many n => false
        System.out.println("==================================================");


        //+ once or more times
        myReg.quantifiersSumSing("Cambodia","");
        myReg.quantifiersSumSing("Cambodia","mm");
        System.out.println("==================================================");


        //{n} once or n times
        myReg.quantifiersNTime("Liza", "Li", 3);// Li have 1 => true
        myReg.quantifiersNTime("Liza","LiLiLiLi",3);// Li have 4 times => false
        System.out.println("==================================================");

        //{n,m} n to m times
        myReg.quantifiersN_M_Time("KoK","oK",1,3);
        myReg.quantifiersN_M_Time("KoK","kkkk",1,3);// k has 4 => false
        myReg.quantifiersN_M_Time("KoK","keck",1,3);// keck not found in p => false


        myReg.metacharacters();
    }

}
