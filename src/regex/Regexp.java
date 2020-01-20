package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    // a dote(.) represent for one character

    public void way1Dote(String p,String m){
        Pattern myP = Pattern.compile("."+p+".");
        Matcher myM = myP.matcher(m);
        System.out.println(myM.matches());
    }
    public void way2Dote(String p,String m){
        boolean b=Pattern.compile("."+p).matcher(m).matches();
        System.out.println(b);
    }

    public void way3Dote(String p,String m){
        boolean b=Pattern.matches("."+p,m);
        System.out.println(b);
    }

    //Regular Expression Character classes

    public void Regular(String p,String m){
        System.out.println("The . (dot) represents a single character.");
        System.out.println(Pattern.matches("["+p+"]",m));
    }

    //Regular Expression Character classes and Quantifiers

    public void quantifierQes(String p,String m){
        System.out.println("? quantifier .... occurs once or not at all");
        System.out.println(Pattern.matches("["+p+"]?",m));
    }

    public void quantifiersSumSing(String p,String m){
        System.out.println("+ quantifier .... occurs once or more times");
        System.out.println(Pattern.matches("["+p+"]+",m));
    }

    public void quantifiersMaiSing(String p,String m){
        System.out.println("* quantifier .... occurs not or more times");
        System.out.println(Pattern.matches("["+p+"]*",m));
        System.out.println(Pattern.matches("[liza]","za"));
    }

    public void quantifiersNTime(String p,String m,int n){
        System.out.println("{n} quantifier .... occurs once or n times");
        System.out.println(Pattern.matches("["+p+"]{"+n+"}",m));
        //System.out.println(Pattern.matches("[kok]{2}","kkk"));
    }

    public void quantifiersN_M_Time(String p,String m,int n,int n1){
        System.out.println("{n,m} quantifier .... occurs once or n times");
        System.out.println(Pattern.matches("["+p+"]{"+n+","+n1+"}",m));
        //System.out.println(Pattern.matches("[kok]{"+n+","+n1+"}","kkk"));
        //System.out.println(Pattern.matches("[kok]{5,10}","ooo"));
    }

    //Regular Expression Metacharacters
    public void metacharacters(){
        System.out.println(Pattern.matches("\\d\\d", "19"));
    }




}
