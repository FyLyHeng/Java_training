package Scanners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan=new Scanner(System.in);//provide user input
        System.out.print("Enter user name:");
        String user= myScan.nextLine();//read user input
        System.out.println("User name is "+user);

        System.out.print("Enter user age:");
        int a=myScan.nextInt();
        System.out.println("your age is "+a);

        System.out.print("Enter salary :");
        float salary=myScan.nextFloat();
        System.out.println("your salary is "+salary);
    }
}
