package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        int rsl = 0;
        String[] left = first.split("/");
        String[] right = second.split("/");
        int comp = right[0].compareTo(left[0]);
        if (comp == 0) {
            rsl = first.compareTo(second);
        } else {
            rsl = second.compareTo(first);
        }
        return rsl;
    }
}
