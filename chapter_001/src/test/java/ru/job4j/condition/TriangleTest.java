package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2.0;
        assertEquals(expected, result, .01);
    }

    @Test
    public void whenNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertEquals(expected, result, .01);
    }
}
