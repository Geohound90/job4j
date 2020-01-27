package ru.job4j.stragery;


public class Triangle implements Shape {
    @Override
    public String draw() {
        String enter = System.lineSeparator();
        StringBuilder triangle = new StringBuilder();
        triangle.append("   *");
        triangle.append(enter);
        triangle.append("  * *");
        triangle.append(enter);
        triangle.append(" *   *");
        triangle.append(enter);
        triangle.append("*******");
        return triangle.toString();
    }
}
