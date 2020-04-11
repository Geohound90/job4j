package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Calculate calc = new Calculate();
        List<Double> result = calc.linear(5, 8);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        Calculate calc = new Calculate();
        List<Double> result = calc.quadratic(5, 8);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        Calculate calc = new Calculate();
        List<Double> result = calc.exponential(2, 5);
        List<Double> expected = Arrays.asList(4D, 8D, 16D);
        assertThat(result, is(expected));
    }
}
