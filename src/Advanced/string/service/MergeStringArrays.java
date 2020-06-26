package Advanced.string.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeStringArrays {

    /**
     *
     * @param arr1
     * @param arr2
     * @return return result are list and case to string[]
     */
    public static String[] mergeStringArrays (String[] arr1, String[] arr2){
        if (arr1 == null || arr1.length == 0)
            return arr2;
        if (arr2 == null || arr2.length == 0)
            return arr1;


        List< String > firstList = Arrays.asList(arr1);
        List< String > secondList = Arrays.asList(arr2);

        List <String> result = new ArrayList<>(firstList);
        List <String> temp = new ArrayList<>(firstList);

        //get the duplicate element between secondList and temp
        temp.retainAll(secondList);

        //remove all duplicate element
        result.removeAll(temp);

        /**
         * after remove result have only value that not content on secondList
         * add we addAll element of array secondList to result
         */
        result.addAll(secondList);

        return ((String[]) result.toArray(new String[result.size()]));
    }
}
