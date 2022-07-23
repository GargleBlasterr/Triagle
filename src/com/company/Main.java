package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner one = new Scanner(System.in);
       System.out.println("enter the namber");
       int a = one.nextInt();
       System.out.println("square:"+ (int) Math.pow(a,2)+" cube:" + (int) Math.pow(a,3)+" fourth degree:"+a*a*a*a);

    }

}
