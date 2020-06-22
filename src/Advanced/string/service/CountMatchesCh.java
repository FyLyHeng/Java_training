package Advanced.string.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMatchesCh {

    public static int method1(final String str, final char ch) {

        if (str == null || str.length() == 0)
            return 0;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                count++;
        }

        return count;
    }

    /**
     * Method to finding the number of occurrences of a character in a string using java 8 streams and lambdas.
     *
     * @param str
     * @param character
     * @return int
     */
    public static int method2(final String str, final char character) {
        return (int) str.codePoints().filter(ch -> ch == character).count();
    }

    /**
     * Method to finding the number of occurrences of a character in a string using regular expressions.
     *
     * @param str
     * @param ch
     * @return
     */
    public static int method3(final String str, final char ch) {

//        Pattern pattern = Pattern.compile("[^" + ch + "]*" + ch + "");//params is we convert charator to string
//        Pattern pattern = Pattern.compile(ch);
        Pattern pattern = Pattern.compile(String.valueOf(ch));
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

}
