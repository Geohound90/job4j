package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = left.length() - right.length();
        int index = 0;
        int size = Math.min(left.length(), right.length());
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        while (index < size) {
            if (first[index] != second[index]) {
                return first[index] - second[index];
            }
            index++;
        }
        return rsl;
    }
}
