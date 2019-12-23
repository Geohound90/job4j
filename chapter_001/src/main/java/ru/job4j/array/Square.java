package ru.job4j.array;


public class Square {
    static int square(int a) {
        return a*a;
    }

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int num = 0; num != bound; num++) {
            rst[num] = square(num + 1);
        }
        return rst;
    }
}
