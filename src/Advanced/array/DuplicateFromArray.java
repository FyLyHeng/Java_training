package Advanced.array;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DuplicateFromArray {
    public static void main(String[] args) {

        final int[] arr = {10,30,20,40,60,50,10,30,60,10,30,20,40,50,90,70,0,80,110,130,120,140,610,510,110,310,160,101,301,201,410,501,910,710,410,180};
        Arrays.sort(arr);
        for (int a:arr) { System.out.println(a); }

        System.out.println("start "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));
        System.out.println("Process remove duplicate element of array");
        //call static method to remove duplicate element
        RemoveDuplicates.arrayDuplicate(arr);
        System.out.println("end "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));


        System.out.println("===start "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));
        System.out.println("Process remove duplicate element of array");
        //call static method to remove duplicate element
        int[] newArray = RemoveDuplicates.arrayDuplicateInt(arr);

        for (int a: newArray) {
            System.out.println(a);
        }
        System.out.println("===end "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));


//=================================================================================================================


        System.out.println("\nProcess remove duplicate element of array using HashSet");
        System.out.println("===start "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));

        final Integer[] arrays = {10,30,20,40,60,50,0,70,60,80,100,90};
        RemoveDuplicates.removeByHashSet(arrays);
        System.out.println("===end "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));



        System.out.println("\nProcess remove duplicate element of array using HashSetInt");
        System.out.println("===start "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));

        RemoveDuplicates.removeByHashSetInt(arrays);
        for (Integer element:arrays) {
            System.out.println(element);
        }
        System.out.println("===end "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));
    }

}
