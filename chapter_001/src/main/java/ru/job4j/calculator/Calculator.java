package ru.job4j.calculator;

/**
 * Calculator
 *
 * @author Maksim Pavlov (geohoun90@gmail.com)
 */
public class Calculator {
    /**
     * Method add.
     * @param first First number.
     * @param second Second number.
     */
    public static void add(double first, double second) {
        /**
         * Contains the result of adding the first and second
         */
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Method div.
     * @param first First number.
     * @param second Second number.
     */
    public static void div(double first, double second) {
        /**
         * Contains the result of dividing the first and second
         */
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Method multiply.
     * @param first First number.
     * @param second Second number.
     */
    public static void multiply(double first, double second) {
        /**
         * Contains the result of multiplying the first and second
         */
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Method subtrack.
     * @param first First number.
     * @param second Second number.
     */
    public static void subtrack(double first, double second) {
        /**
         * Contains the result of subtracting the first and second
         */
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(15, 5);
    }
}
