package ru.job4j.condition;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double per = (a + b + c) / 2;
        return per;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    public static boolean exist(double a, double b, double c) {
        boolean result = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
        return result;
    }
}
