package ru.job4j.tracker;

public class ItemList {
    public static void showItems(Item[] item, int number) {
        for (int index = 0; index < number; index++) {
            System.out.println("Item #" + index);
            System.out.println("Id: " + item[index].getId());
            System.out.println("Name: " + item[index].getName());
        }
    }
}
