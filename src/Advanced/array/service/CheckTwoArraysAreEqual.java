package Advanced.array.service;

public class CheckTwoArraysAreEqual {

    public static boolean checkEquals(final int[] array1, final int[] array2){
        if (array1 == array2)
            return true;
        if (array1 == null || array2 == null)
            return false;


        final int length = array1.length;
        if (array2.length != length)
            return false;

        for (int i = 0; i < length; i++) {
            if (array1[i] != array2[i])
                return false;
        }

        return true;
    }

    public static boolean overrideEquals(final Object[] array1, final Object[] array2){

        if (array1 == array2)
            return true;
        if (array1 == null || array2 == null)
            return false;

        final int length = array1.length;

        for (int i = 0; i < length; i++) {
            final Object obj1 = array1[i];
            final Object obj2 = array2[i];

            if (!(obj1 == null ? obj2 == null : obj1.equals(obj2)))
                return false;
        }

        return true;
    }
}
