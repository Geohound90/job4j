package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void comparisonOfTwoNumbers() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void comparisonOfThreeNumbers() {
        int result = Max.max(3, 2, 6);
        assertThat(result, is(6));
    }

    @Test
    public void comparisonOfFourNumbers() {
        int result = Max.max(2, 9, 8, 5);
        assertThat(result, is(9));
    }
}
