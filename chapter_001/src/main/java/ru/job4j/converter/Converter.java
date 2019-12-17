package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in_ruble = 140;
        int in_euro = 3;
        int in_dollar = 4;
        int expected_euro = 2;
        int expected_dollar = 2;
        int expected_euro_r = 210;
        int expected_dollar_r = 240;
        int out_rTE = rubleToEuro(in_ruble);
        int out_rTD = rubleToDollar(in_ruble);
        int out_eTR = euroToRuble(in_euro);
        int out_dTR = dollarToRuble(in_dollar);
        boolean passed_rTE = expected_euro == out_rTE;
        boolean passed_rTD = expected_dollar == out_rTD;
        boolean passed_eTR = expected_euro_r == out_eTR;
        boolean passed_dTR = expected_dollar_r == out_dTR;
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int ruble_euro = euroToRuble(3);
        int ruble_dollar = dollarToRuble(4);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars");
        System.out.println("3 euro are " + ruble_euro + " rubles");
        System.out.println("4 dollars are " + ruble_dollar + " rubles");
        System.out.println("-------------TEST-------------");
        System.out.println("140 rubles are 2 euro. Test result : " + passed_rTE);
        System.out.println("140 rubles are 2 dollars. Test result : " + passed_rTD);
        System.out.println("3 euro are 210 rubles. Test result : " + passed_eTR);
        System.out.println("4 dollars are 240 rubles. Test result : " + passed_dTR);
    }
}
