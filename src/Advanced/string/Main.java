package Advanced.string;

import Advanced.string.service.CountMatchesCh;
import Advanced.string.service.CountOccuranceOfSubString;
import Advanced.string.service.FindWordOfString;
import Advanced.string.service.MergeStringArrays;

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
        String[] result = MergeStringArrays.method1(arr1,arr2);

        for (String s:result) {
            System.out.println(s);
        }
    }

}
