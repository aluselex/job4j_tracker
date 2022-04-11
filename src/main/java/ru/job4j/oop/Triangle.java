package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (first.distance(second) + second.distance(third) + first.distance(third)) / 2;
    }

    public boolean exist(double ab, double bc, double ac) {
        ab = first.distance(second);
        bc = second.distance(third);
        ac = first.distance(third);
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }
}
