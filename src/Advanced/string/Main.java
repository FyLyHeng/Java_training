package Advanced.string;

import Advanced.string.service.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("java developers guide");
        FindWordOfString.method1();
        FindWordOfString.method2();
        FindWordOfString.method3();
        System.out.println("\ncount Occurance of String");

        int count1 = CountOccuranceOfSubString.count("javadevelopersguides", "java");
        System.out.println(count1);

        int count2 = CountOccuranceOfSubString.count("guidesjavajava", "java");
        System.out.println(count2);


        //Java Program to Count the Occurrences of Each Character in String
        System.out.println("\nJava Program to Count the Occurrences of Each Character in String");
        System.out.println("javaguides");
        int find1 = CountMatchesCh.method1("javaguides",'a');
        System.out.println(find1);

        int find2 = CountMatchesCh.method2("javaguides",'a');
        System.out.println(find2);

        int find3 = CountMatchesCh.method3("javaguides",'a');
        System.out.println(find3);

        System.out.println("\nTo takes care of eliminating duplicates and checks null values.");

        String[] arr1 = {"abc", "xyz", "pqr"};
        String[] arr2 = {"abc", "ABC", "PQR"};
        String[] result = MergeStringArrays.mergeStringArrays(arr1,arr2);

        for (String s:result) {
            System.out.println(s);
        }

        System.out.println("\n===================================");
        System.out.println("5 ways to reverse a String in Java");
        StringReverse.reverseWithStringConcat("HiJava");
        StringReverse.reverseWithStringBuilder("HiJava");
        StringReverse.reverseWithStringBuilderBuiltinMethod("HiJava");


        System.out.println("\n===================================");
        System.out.println("Java Program To Reverse Each Word Of A String.");
        ReverseEachWord.reversEachWord("Hi Java");


    }

}
