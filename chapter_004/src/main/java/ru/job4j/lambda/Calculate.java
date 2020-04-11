package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Calculate {
    private static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl= new ArrayList<>();
        for (int index = start; index < end; index++) {
            rsl.add(func.apply((double) index));
        }
        return rsl;
    }

    public List<Double> linear(int start, int end) {
        Function<Double, Double> func = (x) -> {
            return (2 * x) + 1;
        };
        return diapason(start, end, func);
    }

    public List<Double> quadratic(int start, int end) {
        Function<Double, Double> func = (x) -> {
            return Math.pow(x, 2D);
        };
        return diapason(start, end, func);
    }

    public List<Double> exponential(int start, int end) {
        Function<Double, Double> func = (x) -> {
            return Math.pow(2D, x);
        };
        return diapason(start, end, func);
    }
}
