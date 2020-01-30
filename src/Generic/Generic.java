package Generic;

public class Generic {

    /**
     * GenericMethod
     * @param inputArray
     * @param <E>
     */
    public static <E> void printArray(E[] inputArray){

        for (E element : inputArray){
            System.out.print(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] integers = {1,3,2,4,5};
        Double[] doubles = {1.1,2.2,3.3,4.4};
        Character[] characters = {'H','E','L','L','O'};


        System.out.println("invoked Generic method");
        printArray(integers);
        printArray(doubles);
        printArray(characters);
    }
}
