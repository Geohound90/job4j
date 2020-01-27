package ru.job4j.stragery;

public class Square implements Shape {
    @Override
    public String draw() {
        String enter = System.lineSeparator();
        StringBuilder square = new StringBuilder();
        square.append("*******");
        square.append(enter);
        square.append("*     *");
        square.append(enter);
        square.append("*     *");
        square.append(enter);
        square.append("*******");
        return square.toString();
    }
}
