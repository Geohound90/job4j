package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LevelOfTest {
    @Test
    public void whenLevelOf() {
        StudentFilter stud = new StudentFilter();
        List<Student> students = asList(
                null,
                new Student("name2", 90),
                new Student("name3", 70),
                null,
                new Student("name1", 80)
        );
        List<Student> result = stud.levelOf(students, 70);
        List<Student> expected = asList(
                students.get(1),
                students.get(4)
        );
        assertThat(result, is(expected));
    }
}
