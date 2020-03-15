package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "------ Item editing ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        String id = input.askStr("Please enter the item id you want to edit: ");
        String name = input.askStr("Please, enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item successfully edited!");
        } else {
            System.out.println("Incorrect input!");
        }
        return true;
    }
}
