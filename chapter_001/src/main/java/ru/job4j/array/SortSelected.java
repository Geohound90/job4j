package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = -1;
        int count = 0;
        for (int index = 0; index != data.length; index++) {
            int temp = data[index];
            min = MinDiapason.findMin(data, index, data.length - 1);
            count = FindLoop.indexOf(data, min, index, data.length - 1);
            data[index] = min;
            data[count] = temp;
        }
        return data;
    }
}
