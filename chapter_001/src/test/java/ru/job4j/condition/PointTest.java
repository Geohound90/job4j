package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        Point a = new Point(0, 3);
        Point b = new Point(2, 4);
        double expected = 2.24;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 6);
        double expected = 4.47;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        Point a = new Point(2, 1);
        Point b = new Point(5, 3);
        double expected = 3.60;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(2, 3, 4);
        Point b = new Point(1, 5, 6);
        double expected = 3.0;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, .01);
    }
}
