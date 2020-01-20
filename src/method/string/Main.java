package method.string;


public class Main {
    public static void main(String[] args) {

        StringConcatenation mySt=new StringConcatenation();
        mySt.conBySing("Liza"," kok");
        mySt.conByAppend("Kok"," JM");
        mySt.conByConcat("Chea"," Chong");
        mySt.intString(10,20,"kok");
        mySt.stringTrim("This is Liza kok");
        mySt.stringReplace("Hello this as a string","as","is");
        mySt.stringDelete("This is a java",7,9);
        mySt.stringRemove("This is a java"," a");

        StringBuffer sb=new StringBuffer("This is a java");
        mySt.stringCapacity(sb);

        StringBuffer newSt=new StringBuffer("The most powerful");
        mySt.stringBufferAppend(sb,newSt);

        System.out.println(mySt.stringJoin("12","06","2019","/"));
        System.out.println(mySt.stringJoin2("08","00",":"));


        mySt.stringSlit("My name is liza kok"," ");




    }
}
