package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "------ List of items on Tracker ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        if (items.size() == 0) {
            System.out.println("No items found!");
        } else {
            StartUI.showItems(items);
        }
        return true;
    }
}
