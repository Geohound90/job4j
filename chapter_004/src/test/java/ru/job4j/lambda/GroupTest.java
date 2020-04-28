package ru.job4j.lambda;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class GroupTest {
    @Test
    public void whenGroupStudents() {
        var students = List.of(
                new Student("Max", Set.of("1", "2")),
                new Student("John", Set.of("2", "3")),
                new Student("Alex", Set.of("1", "3"))
        );
        var expected = Map.of(
                "1", Set.of("Max", "Alex"),
                "2", Set.of("Max", "John"),
                "3", Set.of("John", "Alex")
        );
        var result = Group.sections(students);
        assertThat(result, is(expected));
    }
}
