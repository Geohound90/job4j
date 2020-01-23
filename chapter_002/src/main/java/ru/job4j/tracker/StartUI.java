package ru.job4j.tracker;

public class StartUI {
    public void showItems(Item[] item, int number) {
        for (int index = 0; index < number; index++) {
            System.out.println("Item #" + index);
            System.out.println("Id: " + item[index].getId());
            System.out.println("Name: " + item[index].getName());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("------ Create new item ------");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item <" + name + "> successfully created!");
            } else if (select == 1) {
                System.out.println("List of items on Tracker:");
                Item[] items = tracker.findAll();
                if (items.length == 0) {
                    System.out.println("No items found!");
                } else {
                    showItems(items, items.length);
                }
            } else if (select == 2) {
                Item[] items = tracker.findAll();
                System.out.println("------ Item editing ------");
                System.out.println("List of items on Tracker:");
                showItems(items, items.length);
                String id = input.askStr("Please enter the item id you want to edit: ");
                String name = input.askStr("Please, enter new name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item successfully edited!");
                } else {
                    System.out.println("Incorrect input!");
                }
            } else if (select == 3) {
                Item[] items = tracker.findAll();
                System.out.println("------ Deleting item ------");
                System.out.println("List of items on Tracker:");
                showItems(items, items.length);
                String id = input.askStr("Please enter the item id you want to delete: ");
                if (tracker.delete(id)) {
                    System.out.println("Item successfully deleted!");
                } else {
                    System.out.println("Incorrect input!");
                }
            } else if (select == 4) {
                System.out.println("----- Finding item by id ------");
                String id = input.askStr("Please enter id: ");
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with id: " + id + " not found!");
                } else {
                    System.out.println("Found item: ");
                    System.out.println("Id: " + item.getId());
                    System.out.println("Name: " + item.getName());
                }
            } else if (select == 5) {
                System.out.println("----- Finding item by name ------");
                String name = input.askStr("Please enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length == 0) {
                    System.out.println("Items with name: " + name + " not found!");
                } else {
                    System.out.println("Found items: ");
                    showItems(items, items.length);
                }
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Incorrect input! Please repeat...");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
