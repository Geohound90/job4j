package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int index = 0;
        int first = 0;
        int second = 0;
        while (index < left.length()) {
            if (Character.isDigit(left.charAt(index))) {
                while (Character.isDigit(left.charAt(index))) {
                    sb.append(left.charAt(index));
                    index++;
                }
                first = Integer.parseInt(sb.toString());
            } else index++;
        }
        index = 0;
        while (index < right.length()) {
            if (Character.isDigit(right.charAt(index))) {
                while (Character.isDigit(right.charAt(index))) {
                    sb2.append(right.charAt(index));
                    index++;
                }
                second = Integer.parseInt(sb2.toString());
            } else index++;
        }
        return Integer.compare(first, second);
    }
}
