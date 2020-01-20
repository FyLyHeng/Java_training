package com.company;

public class Break_lable {
    public static void main(String[] args) {
        Boolean t=true;

        first:{
            second:{
                third:{
                    if (t)break third;
                    System.out.println("this is third loop and before break statement.");
                }
                System.out.println("this is second loop");
            }
            System.out.println("This is main loop");
        }
    }
}
