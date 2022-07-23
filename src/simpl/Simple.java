package simpl;

import java.util.Scanner;

public class Simple {
    public static final double  METERS_IN_INCHES = 0.0254;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a value for inch");
        double inch = input.nextDouble();
        double meter = inch * METERS_IN_INCHES;
        System.out.printf(inch+" inch  = "  + meter + " meter "  );
        System.out.println("tt");
    }
}
