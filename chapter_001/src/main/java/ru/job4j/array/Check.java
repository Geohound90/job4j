package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == data[0]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
