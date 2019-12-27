package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void distance() {
        int inx1 = 0;
        int inx2 = 0;
        int iny1 = 2;
        int iny2 = 0;
        double expected = 2.0;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int inx1 = 0;
        int inx2 = 2;
        int iny1 = 3;
        int iny2 = 4;
        double expected = 2.24;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        int inx1 = 1;
        int inx2 = 3;
        int iny1 = 2;
        int iny2 = 6;
        double expected = 4.47;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        int inx1 = 2;
        int inx2 = 5;
        int iny1 = 1;
        int iny2 = 3;
        double expected = 3.60;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
