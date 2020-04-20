package ru.job4j.collection;

import java.util.List;
import java.util.Collections;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println(rsl);
        String maxim = "Maxim";
        String alex = "Alex";
        int rslStr = maxim.compareTo(alex);
        System.out.println(rslStr);
    }
}
