package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int newIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int[] rsl = new int[left.length + right.length];

            while (newIndex < rsl.length) {
                if (leftIndex == left.length) {
                    rsl[newIndex++] = right[rightIndex++];
                } else if (rightIndex == right.length) {
                    rsl[newIndex++] = left[leftIndex++];
                } else {
                    rsl[newIndex++] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
                }
            }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
