package Generic;

public class BoundedType {

    public static <T extends Comparable<T>> T maxMin(T x, T y, T z) {

        T max = x;
        if ((y.compareTo(max)) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0){
            max = z;
        }

        return max;
    }
}
