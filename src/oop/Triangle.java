package oop;

public class Triangle {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }




    public String toString() {
        return "Triangle [a=" + a + ",b=" + b + "]";

    }

    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(8, 10);
        System.out.println(triangleOne);
        System.out.println( " area of triangle ");
    }


}
