package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public List<Integer> convert(Integer[][] intArray) {
       return Stream.of(intArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
