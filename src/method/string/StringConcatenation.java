package method.string;

public class StringConcatenation {

    public String result;
    public void conBySing(String st1,String st2){
        result=st1+st2;
        System.out.println(result);
    }



    public void conByAppend(String st1,String st2){
        result=(new StringBuilder()).append(st1).append(st2).toString();
        System.out.println(result);
    }



    public void conByConcat(String st1,String st2){
        result=st1.concat(st2);
        System.out.println(result);
    }



    public void intString(int num1,int num2,String st){
        result=num1+num2+st+num1+num2;
        System.out.println(result);
    }



    public void stringTrim(String st1){
        result="  "+st1+"  ";
        System.out.println("Before trim "+result+" length is "+result.length());
        String rs=result.trim();
        System.out.println("After trim "+rs+" length is "+rs.length());

    }


    public void stringReplace(String st1,String wrong,String right){
        result=st1.replace(wrong,right);
        System.out.println(result);
    }



    public void stringRemove(String st1,String remove){
        result=st1.replaceFirst(remove,"");
        System.out.println(result);
    }



    public void stringDelete(String st1, int index1, int index2){
        StringBuffer sb=new StringBuffer(st1);
        sb.delete(index1,index2);
        System.out.println(sb);
    }



    public void stringCapacity(StringBuffer st1){
        System.out.println(st1.capacity());
    }



    public void stringBufferAppend(StringBuffer st1,StringBuffer newString){
        System.out.println("Before Append "+st1.capacity());
        st1.append(newString);
        System.out.println("After Append "+st1.capacity());
    }



    public String stringJoin(String day,String month,String year,String join){
        result=String.join(join,day,month,year);
        return result;
    }



    public String stringJoin2(String time,String mun,String join){
        String result=String.join(join,time,mun);
        return this.result+" "+result;
    }



    public void stringSlit(String str1, String cutSing){
        String str[]=str1.split(cutSing);
        for (String result : str){
            System.out.println(result);
        }
    }
}
