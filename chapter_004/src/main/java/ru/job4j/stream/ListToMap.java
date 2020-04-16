package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Pavlov Maxim Igorevich", 70),
                new Student("Ivanov Sergey Sergeevich", 50 ),
                new Student("Pavlov Maxim Igorevich", 70),
                new Student("Chernov Alexey Ivanovich", 90)
        );
        System.out.println(students.stream().distinct().collect(
                Collectors.toMap(
                        student -> student.getFio(),
                        student -> (Object) student
                ))
        );
    }
}
