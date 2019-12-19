package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean firstCondition = first > second;
        int firstResult = firstCondition ? first : second;
        boolean finalCondition = firstResult > third;
        int finalResult = finalCondition ? firstResult : third;
        return finalResult;
    }
}
