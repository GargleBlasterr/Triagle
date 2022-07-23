package com.company;

import java.util.Scanner;

public class Txt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        double height = in.nextDouble();
        System.out.printf(" name: "+name+ ";ag: "+age+";height: "+height);

    }
}
