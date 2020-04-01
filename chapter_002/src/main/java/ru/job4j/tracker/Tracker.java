package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> item = new ArrayList<>();
        for (Item check : items) {
            if (check.getName().equals(key)) {
                item.add(check);
            }
        }
        return item;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        if (index != -1) {
            return items.get(index);
        } else {
            return null;
        }
    }

    private int indexOf(String id) {
        int rsl = -1;
        int index = 0;
        for (Item check : items) {
            if (check.getId().equals(id)) {
                rsl = index;
            }
            index++;
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items.get(index).getId());
            items.set(index, item);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        boolean rsl = false;
        if (index != -1) {
            items.remove(index);
            rsl = true;
        }
        return rsl;
    }
}
