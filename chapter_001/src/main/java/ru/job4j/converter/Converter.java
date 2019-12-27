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
        int inruble = 140;
        int ineuro = 3;
        int indollar = 4;
        int expectedeuro = 2;
        int expecteddollar = 2;
        int expectedeuror = 210;
        int expecteddollarr = 240;
        int outrTE = rubleToEuro(inruble);
        int outrTD = rubleToDollar(inruble);
        int outeTR = euroToRuble(ineuro);
        int outdTR = dollarToRuble(indollar);
        boolean passedrTE = expectedeuro == outrTE;
        boolean passedrTD = expecteddollar == outrTD;
        boolean passedeTR = expectedeuror == outeTR;
        boolean passeddTR = expecteddollarr == outdTR;
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(140);
        int rubleeuro = euroToRuble(3);
        int rubledollar = dollarToRuble(4);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars");
        System.out.println("3 euro are " + rubleeuro + " rubles");
        System.out.println("4 dollars are " + rubledollar + " rubles");
        System.out.println("-------------TEST-------------");
        System.out.println("140 rubles are 2 euro. Test result : " + passedrTE);
        System.out.println("140 rubles are 2 dollars. Test result : " + passedrTD);
        System.out.println("3 euro are 210 rubles. Test result : " + passedeTR);
        System.out.println("4 dollars are 240 rubles. Test result : " + passeddTR);
    }
}
