package ru.job4j.pojo;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("one", 10);
        Product second = new Product("one", 10);
        System.out.println(first.equals(second));
    }
}
