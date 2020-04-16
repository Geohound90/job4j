package ru.job4j.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static void main(String[] args) {
        Integer[][] intArray = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        Stream.of(intArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
