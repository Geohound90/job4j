package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>(
                Set.of(
                        "Lada",
                        "BMW",
                        "Volvo",
                        "Toyota"
                )
        );
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
