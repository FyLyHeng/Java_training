package StringTokenizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        System.out.println("StringTokenizer Constructors 1 - ");

        StringTokenizer tokenizer = new StringTokenizer("Hello Reader, Token is here"," ");

        //this stringTokenizer is split by " "(space) in socend parameter of StringTokenizer constructor
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }


        System.out.println("\nStringTokenizer Constructor 2 -");
        StringTokenizer tokenizer1 = new StringTokenizer("Java : code : String"," :");

        while (tokenizer1.hasMoreTokens()){
            System.out.println(tokenizer1.nextToken());
        }


        System.out.println("\nStringTokenizer Constructor 3 -");
        /**
         * s1 aS  = split to token where a and S
         * b true = each token are contact those character (a,s)
         * b false = each token through (a,s) mean new token(sub String) will have no a,S content!!!
         */
        StringTokenizer tokenizer2 = new StringTokenizer("JavaCodeString","aS",true);

        while (tokenizer2.hasMoreTokens()){
            System.out.println(tokenizer2.nextToken());
        }



        System.out.println("\nStringTokenizer Constructor 4 -");
        /**
         * " x"  = split to token where space or x
         * b true = each token are contact those (space or x)
         * b false = each token through space or x, mean new token (sub String) will have no x or space in!!!
         */
        StringTokenizer tokenizer3 = new StringTokenizer("Java code String","x ",true);

        while (tokenizer3.hasMoreTokens()){
            System.out.println(tokenizer3.nextToken());
        }
    }
}
