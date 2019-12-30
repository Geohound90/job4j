package ru.job4j.array;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int newIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int[] rsl = new int[left.length + right.length];
        if (leftIndex == left.length) {
            System.arraycopy(right, rightIndex, rsl, newIndex++, right.length - rightIndex);
        } else if (rightIndex == right.length) {
            System.arraycopy(left, leftIndex, rsl, newIndex++, left.length - leftIndex);
        } else while (newIndex < rsl.length) {
            rsl[newIndex] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            if (leftIndex == left.length) {
                System.arraycopy(right, rightIndex, rsl, ++newIndex, right.length - rightIndex);
                break;
            }
            if (rightIndex == right.length) {
                System.arraycopy(left, leftIndex, rsl, ++newIndex, left.length - leftIndex);
                break;
            }
            newIndex++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
