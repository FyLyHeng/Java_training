package Advanced.string.service;

public class CountOccuranceOfSubString {

    private static boolean hasLength(String str){
        return (str != null && !str.isEmpty());
    }

    public static int count(String str, String sub){
        if (!hasLength(str) || !hasLength(sub))
        return 0;

        int count = 0;
        int pos = 0; // mean start search from index 0 of string str
        int idx;

        while ( (str.indexOf(sub,pos))!= -1 ){

            //if found assign the first index subString that found to idx
            idx = str.indexOf(sub,pos);
            System.out.println("idx = "+idx);
            ++count;

            //idx is first index of found subString in str
            //mean (idx + total index of subString )
            pos = idx + sub.length();
        }
        //it will return -1 if it hold string is not found

        return count;
    }
}
