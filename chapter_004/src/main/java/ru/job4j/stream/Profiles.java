package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        Comparator<Address> comparator = (left, right) -> left.getCity().compareTo(right.getCity());
        return profiles.stream().map(
                profile -> profile.getAddress()
        ).distinct().sorted(comparator).collect(Collectors.toList());
    }
}
