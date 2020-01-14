package ru.job4j.tracker;

public class Item {

    public Item(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Item item = new Item("Door");
    }
}
