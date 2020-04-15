package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private String fio;

    private int score;

    public Student(String fio, int score) {
        this.fio = fio;
        this.score = score;
    }

    public String getFio() {
        return fio;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "{"
                + "fio: " + fio
                + ", score: " + score
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fio, student.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }
}
