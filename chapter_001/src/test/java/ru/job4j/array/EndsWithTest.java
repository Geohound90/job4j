package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenStartWithPrefixThenTrueBack() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWithBack(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalseBack() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWithBack(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenStartWithPrefixThenTrueForward() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWithForward(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalseForward() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWithForward(word, post);
        assertThat(result, is(false));
    }
}
