package box;

import static java.lang.Math.*;

public class Box implements VolumeOfaBox {
    private double a;
    private double b;
    private double c;


    public Box(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    public String resultat() {
        return "Parallelepiped [a=" + a + " b=" + b + " c=" + c + "]";
    }


    @Override
    public double volumeOfaBox() {
        return a * b * c;
    }
}
