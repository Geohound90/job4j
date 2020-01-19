package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items,position);
    }

    public Item[] findByName(String key) {
        Item[] item = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getName().equals(key)) {
                item[size] = this.items[index];
                size++;
            }
        }
        item = Arrays.copyOf(item, size);
        return item;
    }

    public Item findById(String id) {
        return items[indexOf(id)];
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public void replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(items[index].getId());
        items[index] = item;
    }
}
