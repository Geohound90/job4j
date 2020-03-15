package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "------ Deleting item ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        String id = input.askStr("Please enter the item id you want to delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item successfully deleted!");
        } else {
            System.out.println("Incorrect input!");
        }
        return true;
    }
}
