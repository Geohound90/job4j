package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StudentFilter {
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(student -> Stream.ofNullable(student))
                .sorted()
                .takeWhile(score -> score.getScore() > bound)
                .collect(Collectors.toList());
    }
}
