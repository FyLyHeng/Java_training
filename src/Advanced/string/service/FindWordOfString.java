package Advanced.string.service;

public class FindWordOfString {

    public static void method1 (){
        final String str = "java developers guide";
        String[] strArr = str.split(" ");
        System.out.println("count is "+strArr.length);
    }

    public static void method2 (){
        final String str = "java developers guide";
        int count = 0;
        for (String s:str.split(" ")) {
            count++;
        }
        System.out.println("count is "+count);
    }

    public static void method3 (){
        final String str = "java developers guide";

        //if check hold string not have space it will return 1
        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            //check if tow space
            if ((str.charAt(i)==' ') && (str.charAt(i+1) != ' '))
                count ++;
        }

        System.out.println("count is "+count);
    }

}
