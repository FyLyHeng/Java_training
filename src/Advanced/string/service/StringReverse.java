package Advanced.string.service;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StringReverse {

    protected static final void display(String original, String revers) {
        System.out.println(original);
        System.out.println(revers);
        System.out.println("---------");
    }

    public static final String reverseWithStringConcat(String str) {
        String output = "";

        for (int i = (str.length()-1); i >= 0; i--) {
            output += ( str.charAt(i) );
        }

        display(str, output);
        return str;
    }



    public static final String reverseWithStringBuilder (String str){
        final StringBuilder builder = new StringBuilder();
        for (int i = (str.length()-1); i >=0 ; i--) {
            builder.append(str.charAt(i));
        }
        display(str,builder.toString());
        return builder.toString();
    }

    public static final String reverseWithStringBuilderBuiltinMethod (String str){
        final StringBuilder builder = new StringBuilder(str);
        display(str, builder.reverse().toString());
        return builder.reverse().toString();
    }
}
