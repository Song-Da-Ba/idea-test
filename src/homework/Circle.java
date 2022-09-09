package homework;


class Circle {
    double r;
    double pi = Math.PI;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        double s = pi * r * r;
        return s;
    }



    public static void main(String[] args) {
        Circle c = new Circle(20);
        Cylinder cylinder = new Cylinder(50, c);
        double v = cylinder.volume();
        System.out.print("圆柱的体积为" + String.format("%.2f", v));
    }
}


