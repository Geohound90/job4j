package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "------ List of items on Tracker ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        if (items.length == 0) {
            System.out.println("No items found!");
        } else {
            StartUI.showItems(items, items.length);
        }
        return true;
    }
}
