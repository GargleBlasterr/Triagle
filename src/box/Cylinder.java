package box;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Cylinder implements VolumeOfaBox {
    private double h;
    private double r;
    private  double PI;

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public Cylinder(double h, double r, double PI) {
        this.h = h;
        this.r = r;
        this.PI=PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }



    public String resultat() {
        return " Cylinder[PI= " + PI + " r^2= " + pow(r, 2) + " h= " + h+"]";
    }


    @Override
    public double volumeOfaBox() {
        return PI * pow(r, 2) * h;
    }
}

