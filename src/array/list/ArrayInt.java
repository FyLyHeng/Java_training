package array.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInt extends ArrayString{
    ArrayList<Integer> myInt=new ArrayList<Integer>();

    public int sum(){
        int result=0;
        for(int i=0;i<myInt.size();i++){
            result +=myInt.get(i);
        }
        return result;
    }

    public void sortInt(){
        Collections.sort(myInt);
        for (int item:myInt){
            System.out.println(item);
        }
    }
}
