package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenFilterStudentsTo10A() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("name 1", 10),
                new Student("name 2", 60),
                new Student("name 3", 40),
                new Student("name 4", 100),
                new Student("name 5", 90)
        );
        Predicate<Student> predicate = student -> (student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(students.get(3));
        expected.add(students.get(4));
        assertThat(result, is(expected));
    }

    @Test
    public void whenFilterStudentsTo10B() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("name 1", 10),
                new Student("name 2", 60),
                new Student("name 3", 40),
                new Student("name 4", 100),
                new Student("name 5", 90)
        );
        Predicate<Student> predicate = student -> (student.getScore() >= 50 && student.getScore() < 70);
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(students.get(1));
        assertThat(result, is(expected));
    }

    @Test
    public void whenFilterStudentsTo10C() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("name 1", 10),
                new Student("name 2", 60),
                new Student("name 3", 40),
                new Student("name 4", 100),
                new Student("name 5", 90)
        );
        Predicate<Student> predicate = student -> (student.getScore() >= 0 && student.getScore() < 50);
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = new ArrayList<>();
        expected.add(students.get(0));
        expected.add(students.get(2));
        assertThat(result, is(expected));
    }
}
