package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void showItems(Item[] item, int number) {
        for (int index = 0; index < number; index++) {
            System.out.println("Item #" + index);
            System.out.println("Id: " + item[index].getId());
            System.out.println("Name: " + item[index].getName());
        }
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("------ Create new item ------");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                Scanner choose = new Scanner(System.in);
                Item[] items = tracker.findAll();
                System.out.println("------ Item editing ------");
                System.out.println("List of items on Tracker:");
                showItems(items, items.length);
                System.out.print("Please enter the item id you want to edit: ");
                String id = choose.nextLine();
                if (tracker.findById(id) == null) {
                    System.out.println("Incorrect input!");
                } else {
                    System.out.print("Please, enter new name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.replace(id, item);
                    System.out.println("Item successfully edited!");
                }
            } else if (select == 3) {
                Scanner choose = new Scanner(System.in);
                Item[] items = tracker.findAll();
                System.out.println("------ Deleting item ------");
                System.out.println("List of items on Tracker:");
                showItems(items, items.length);
                System.out.print("Please enter the item id you want to delete: ");
                String id = choose.nextLine();
                if (tracker.findById(id) == null) {
                    System.out.println("Incorrect input!");
                } else {
                    tracker.delete(id);
                    System.out.println("Item successfully deleted!");
                }
            } else if (select == 4) {
                Scanner choose = new Scanner(System.in);
                System.out.println("----- Finding item by id ------");
                System.out.print("Please enter id: ");
                String id = choose.nextLine();
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with id: " + id + " not found!");
                } else {
                    System.out.println("Found item: ");
                    System.out.println("Id: " + item.getId());
                    System.out.println("Name: " + item.getName());
                }
            } else if (select == 5) {
                Scanner choose = new Scanner(System.in);
                System.out.println("----- Finding item by name ------");
                System.out.print("Please enter name: ");
                String name = choose.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
