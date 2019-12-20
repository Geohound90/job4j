package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = check.max(5, 4, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = check.max(5,7,4,2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = check.max(3,4,9,7);
        assertThat(result, is(9));
    }

    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(3,7,2,8);
        assertThat(result, is(8));
    }
}
