package Advanced.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    //this method use temp array
    public static void arrayDuplicate(final int[] arr) {

        final int[] temp = new int[arr.length];
        int j = 0;
        //loop through arr
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        //assign last value of arr to temp
        temp[j++] = arr[arr.length -1];

        //loop through length of j
        //index less lest that before
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
    }

    //this method use temp array
    public static int[] arrayDuplicateInt(final int[] arr) {

        final int[] temp = new int[arr.length];
        int j = 0;
        //loop through arr
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] != arr[i + 1]) {
                //add only not duplicate element to temp
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length -1];

        //return new array index will tess that before
        int[] newArray = new int[j];
        for (int i = 0; i < j ; i++) {
            newArray[i] = temp[i];
        }
       return newArray;
    }


    public static void removeByHashSet(final Integer[] arr){
        final Set<Integer> sets = new HashSet<>();
        Arrays.sort(arr);

        //assign all element arr to temp
        final Integer[] temp = new Integer[arr.length];
        int j=0;

        for (final Integer element:arr) {
            // add method is add only element not exist
            if (sets.add(element)){
                temp[j++] = element;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
    }

    public static Integer[] removeByHashSetInt(final Integer[] arr){
        Arrays.sort(arr);
        final Set<Integer> sets = new HashSet<>();

        //assign all element arr to temp
        Integer[] temp = new Integer[arr.length];
        int j=0;

        for (final Integer element:arr) {
            // add method is add only element not exist
            if (sets.add(element)){
                temp[j++] = element;
            }
        }

        return temp;
    }
}
