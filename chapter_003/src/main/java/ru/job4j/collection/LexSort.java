package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int first = Integer.parseInt(left.replaceAll("[^0-9]",""));
        int second = Integer.parseInt(right.replaceAll("[^0-9]", ""));
        return Integer.compare(first, second);
    }
}
