package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int in_p = 4;
        int in_k = 1;
        double expected = 1.0;
        double out = SqArea.square(in_p, in_k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        int in_p = 6;
        int in_k = 2;
        double expected = 2.0;
        double out = SqArea.square(in_p, in_k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
