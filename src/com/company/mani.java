package com.company;

import java.util.Scanner;

public class mani {
    public static void main(String[] args) {
       Scanner one = new Scanner(System.in);
       System.out.println("enter the namber");
       int a = one.nextInt();
       System.out.println("square:"+ (int) Math.pow(a,2)+" cube:" +a*a*a+" fourth degree:"+a*a*a*a);

    }

}
