package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {1, 3, 5, 10},
                        1, 3
                ),
                is(3)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {9, 10, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {9, 3, 5, 1},
                        0, 2
                ),
                is(3)
        );
    }
}
