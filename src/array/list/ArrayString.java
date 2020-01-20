package array.list;

import java.util.*;

public class ArrayString {
    ArrayList<Object> arrName=new ArrayList<Object>();

    public void addList(String name){
        arrName.add(name);
    }
    public void addList(int value){
        arrName.add(value);
    }

    public void outList(){
        System.out.println(arrName);
    }

    public Object getByIndex(int index) {
        if (index>=countIndex()){
            return "over index input";
        }else if (index<0)
               return "Index not found!!";
        return arrName.get(index);
    }

    public String changeItem(int index,String newValue){
        String result ="";
        if (index>=countIndex())
            result= "over index input";
        else if (index<0)
            result= "Index not found!!";
        else
        arrName.set(index,newValue);
        return result;
    }

    public String removeItem(int index){
        String result ="";
        if (index>=countIndex())
            result= "over index input";
        else if (index<0)
            result= "Index not found!!";
        else
        arrName.remove(index);
        return result;
    }

    public int countIndex(){
        int i;
        for ( i= 0; i <arrName.size(); i++);
        return i;
    }
//    public String countIndex2(int index){
//        String result="";
//        if (index>=countIndex())
//            result= "over index input";
//        else if (index<0)
//            result= "Index not found!!";
//        else
//            result=index+"";
//        return result;
//    }

    public void shot(){
        Collections.reverse(arrName);
    }
}
