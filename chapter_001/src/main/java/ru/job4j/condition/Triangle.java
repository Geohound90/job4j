package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ac, double ab, double bc) {
        boolean triangle = ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
        return triangle;
    }
}
