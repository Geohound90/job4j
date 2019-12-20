package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int finalResult = (first > second) ? ((first > third) ? first : third) : ((second > third) ? second : third);
        return finalResult;
    }
}
