package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + '\n' +
                '\n' + " " + name.substring(9) + " : " + name.substring(9) + "," +
                '\n' + " " + body.substring(9) + " : " + body.substring(9) + '\n' +
                '\n' + "}";
    }
}
