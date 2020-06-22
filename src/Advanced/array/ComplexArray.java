package Advanced.array;

import Advanced.array.service.CheckTwoArraysAreEqual;
import Advanced.array.service.RemoveDuplicates;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ComplexArray {
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

        Integer[] newArr =  RemoveDuplicates.removeByHashSetInt(arrays);
        for (Integer element:newArr) {
            System.out.println(element);
        }
        System.out.println("===end "+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date()));



//=================================================================================================================

        final int[] array1 = {1,2,3,4,5};
        final int[] array2 = {1,2,3,4,5};


        final boolean check = Arrays.equals(array1,array2);
        System.out.println("check by build in method of array");
        System.out.println("check "+check);

        final boolean check1 = CheckTwoArraysAreEqual.checkEquals(array1,array2);
        System.out.println("check1 "+check1);


        final Integer[] array01 = {1,2,3,4,5};
        final Integer[] array02 = {1,2,3,4,5};
        final boolean check2 = CheckTwoArraysAreEqual.overrideEquals(array01, array02);
        System.out.println("check2 "+check2);





    }

}
