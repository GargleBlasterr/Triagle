package boxx;


public class CylinderBox implements BoxInterface {
    private double h;
    private double r;
    double price;

    public CylinderBox(double h, double r, double price) {
        this.h = h;
        this.r = r;
        this.price = price;
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

    @Override
    public double findVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
