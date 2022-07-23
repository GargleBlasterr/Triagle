package simpl;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        double a = sw.nextDouble();
        double b = sw.nextDouble();
        boolean resault = a > b;
        System.out.println(" a > b : "+resault);
    }
}
