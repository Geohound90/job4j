package ru.job4j.stragery;

public class Paint implements Shape {
    @Override
    public String draw() {
        return null;
    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint paint = new Paint();
        Square square = new Square();
        Triangle triangle = new Triangle();
        paint.draw(square);
        paint.draw(triangle);
    }

}
