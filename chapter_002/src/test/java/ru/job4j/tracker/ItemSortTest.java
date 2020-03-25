package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemSortTest {
    @Test
    public void sortItemTest() {
        List<Item> input = new ArrayList<>();
        List<Item> expected = new ArrayList<>();
        input.add(new Item("name2"));
        input.add(new Item("name1"));
        input.add(new Item("name3"));
        expected.add(input.get(1));
        expected.add(input.get(0));
        expected.add(input.get(2));
        Collections.sort(input, new ItemSort());
        assertThat(expected, is(input));
    }

    @Test
    public void reverseSortItemTest() {
        List<Item> input = new ArrayList<>();
        List<Item> expected = new ArrayList<>();
        input.add(new Item("name2"));
        input.add(new Item("name1"));
        input.add(new Item("name3"));
        expected.add(input.get(2));
        expected.add(input.get(0));
        expected.add(input.get(1));
        Collections.sort(input, new ItemSortReverse());
        assertThat(expected, is(input));
    }
}
