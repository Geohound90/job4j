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
        List<Item> item = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        item.add(new Item("name2"));
        item.add(new Item("name1"));
        item.add(new Item("name3"));
        items.add(item.get(1));
        items.add(item.get(0));
        items.add(item.get(2));
        Collections.sort(item, new ItemSort());
        assertThat(items, is(item));
    }

    @Test
    public void reverseSortItemTest() {
        List<Item> item = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        item.add(new Item("name2"));
        item.add(new Item("name1"));
        item.add(new Item("name3"));
        items.add(item.get(2));
        items.add(item.get(0));
        items.add(item.get(1));
        Collections.sort(item, new ItemSortReverse());
        assertThat(items, is(item));
    }
}
