package Advanced.string.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeStringArrays {

    /**
     *
     * @param arr1
     * @param arr2
     * @return return result is list and pass to string[]
     */
    public static String[] method1 (String[] arr1, String[] arr2){
        if (arr1 == null || arr1.length == 0)
            return arr2;
        if (arr2 == null || arr2.length == 0)
            return arr1;


        List< String > firstList = Arrays.asList(arr1);
        List< String > secondList = Arrays.asList(arr2);

        List <String> result = new ArrayList<>(firstList);
        List <String> temp = new ArrayList<>(firstList);

        temp.retainAll(secondList);
        result.removeAll(temp);
        result.addAll(secondList);


        for (String s:result.toArray(new String[result.size()])) {
            System.out.println("result "+s);
        }
        return ((String[]) result.toArray(new String[result.size()]));
    }
}
