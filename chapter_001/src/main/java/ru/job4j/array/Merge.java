package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int count = 0;
        int leftside = 0;
        int rightside = 0;
        int[] rsl = new int[left.length + right.length];
            while (count < rsl.length) {
                if (leftside == left.length) {
                    rsl[count++] = right[rightside++];
                } else if (rightside == right.length) {
                    rsl[count++] = left[leftside++];
                } else {
                    rsl[count++] = left[leftside] < right[rightside] ? left[leftside++] : right[rightside++];
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
