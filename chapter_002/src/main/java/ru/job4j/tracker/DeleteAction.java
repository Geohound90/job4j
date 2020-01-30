package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "------ Deleting item ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        String id = input.askStr("Please enter the item id you want to delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item successfully deleted!");
        } else {
            System.out.println("Incorrect input!");
        }
        return true;
    }
}
