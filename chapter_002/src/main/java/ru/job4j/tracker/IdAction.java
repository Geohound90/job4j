package ru.job4j.tracker;

public class IdAction implements UserAction {
    @Override
    public String name() {
        return "------ Finding item by id ------";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Please enter id: ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Item with id: " + id + " not found!");
        } else {
            System.out.println("Found item: ");
            System.out.println("Id: " + item.getId());
            System.out.println("Name: " + item.getName());
        }
        return true;
    }
}
