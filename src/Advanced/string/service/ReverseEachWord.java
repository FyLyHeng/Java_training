package Advanced.string.service;

public class ReverseEachWord {

    private static final String reverseWithStringConcat(String str) {
        String output = "";

        for (int i = (str.length()-1); i >= 0; i--) {
            output += ( str.charAt(i) );
        }
        return output;
    }

    public static String reversEachWord (String str){
        String[] words = str.split(" ");
        String revers = "";

        for (String word:words) {
            revers += reverseWithStringConcat(word) + " ";
        }
        StringReverse.display(str,revers);
        return revers;
    }

}
