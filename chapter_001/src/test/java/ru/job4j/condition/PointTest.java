package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void distance() {
        int in_x1 = 0;
        int in_x2 = 0;
        int in_y1 = 2;
        int in_y2 = 0;
        double expected = 2.0;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int in_x1 = 0;
        int in_x2 = 2;
        int in_y1 = 3;
        int in_y2 = 4;
        double expected = 2.24;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        int in_x1 = 1;
        int in_x2 = 3;
        int in_y1 = 2;
        int in_y2 = 6;
        double expected = 4.47;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        int in_x1 = 2;
        int in_x2 = 5;
        int in_y1 = 1;
        int in_y2 = 3;
        double expected = 3.60;
        double out = Point.distance(in_x1, in_y1, in_x2, in_y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
