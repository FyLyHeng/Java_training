package array.list;

public class Main {
    public static void main(String[] args) {
        ArrayString mySt=new ArrayString();
        System.out.println("==========Add value to array===========");
        mySt.addList("Bopha");
        mySt.addList("Chong");
        mySt.addList("kok");
        mySt.addList("Liza");
        mySt.addList("DDE");
        mySt.outList();

        System.out.println("=========get value by Index============");
        Object a=mySt.getByIndex(2);
        System.out.println(a);

        System.out.println("============change_Item================");
        mySt.changeItem(3,"JM");
        String result =mySt.changeItem(3,"KO");
        mySt.outList();
        System.out.println(result);

        System.out.println("========remove Item from list==========");
        System.out.println(mySt.removeItem(-1));
        mySt.outList();

        System.out.println("================sort===================");
        mySt.shot();mySt.outList();

        System.out.println("\n=======================================");
        System.out.println("Array Integer");
//
        System.out.println("this value send to super class");
        ArrayString myTnt =new ArrayInt();
        myTnt.addList(100); //this value send to super class
        myTnt.outList();
        System.out.println("=========================================");

        ArrayInt myInt=new ArrayInt();
        myInt.addList(30);
        myInt.addList(5);
        myInt.addList(10);
        myInt.outList();

        System.out.println("=================sort====================");
        myInt.sortInt();

    }
}
