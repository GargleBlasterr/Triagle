package boxx;

public class DefoltBox implements BoxInterface {
    private double a;
    private double b;
    private double c;
    private double price;

    public DefoltBox(double a, double b, double c, double price) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.price = price;
    }

    @Override
    public double findVolume() {
        return a * b * c;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
}
