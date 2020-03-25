package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        User user = (User) o;
        Integer age = this.age;
        if (Objects.equals(name, user.name)) {
            return age.compareTo(user.age);
        } else return name.compareTo(user.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (Objects.equals(name, user.name)) {
            return Objects.equals(age, user.age);
        } else return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
