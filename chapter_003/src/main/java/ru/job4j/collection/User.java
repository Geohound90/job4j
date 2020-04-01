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
        int result = name.compareTo(user.name);
        if (result == 0) {
            result = age.compareTo(user.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        boolean result = Objects.equals(name, user.name);
        if (result) {
            result = Objects.equals(age, user.age);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
