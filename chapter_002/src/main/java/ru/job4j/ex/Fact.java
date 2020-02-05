package ru.job4j.ex;

public class Fact {
    public static int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Parameter 'n' must be equal to or higher than 1.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println("Factorial of " + num + " is: " + calc(num));
    }
}
