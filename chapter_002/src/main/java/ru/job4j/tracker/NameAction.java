package ru.job4j.tracker;

public class NameAction implements UserAction {
    @Override
    public String name() {
        return "------ Finding item by name ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Please enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("Items with name: " + name + " not found!");
        } else {
            System.out.println("Found items: ");
            StartUI.showItems(items, items.length);
        }
        return true;
    }
}
