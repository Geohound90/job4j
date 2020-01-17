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
        Item[] item = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index] != null) {
                item[size] = this.items[index];
                size++;
            }
        }
        item = Arrays.copyOf(item, size);
        return item;
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
        Item item = null;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                item = this.items[index];
                break;
            }
        }
        return item;
    }
}
