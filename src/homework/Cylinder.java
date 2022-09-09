package homework;

public class Cylinder {
    int h;
    Circle c;

    public Cylinder(int h, Circle c) {
        this.h = h;
        this.c = c;
    }

    public double volume() {
        double v = c.area() * h;
        return v;
    }
}
