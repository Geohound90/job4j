package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int balance = money - price;
        for (int index = 0; index < coins.length; index++) {
            while ((balance > 0) && (balance >= coins[index])) {
                balance -= coins[index];
                rsl[size] = coins[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
