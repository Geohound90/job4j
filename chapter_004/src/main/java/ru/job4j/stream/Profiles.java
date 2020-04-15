package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream().map(
                profile -> profile.getAddress()
        ).collect(Collectors.toList());
        return rsl;
    }

    public static void main(String[] args) {
        Profiles profiles = new Profiles();
        List<Profile> profile = List.of(
                new Profile(new Address("Moscow", "Uchinskaya", 10, 30)),
                new Profile(new Address("Moscow", "Lobnenskaya", 8, 100)),
                new Profile(new Address("Moscow", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Moscow", "Dolgoprudnaya", 1, 26))
        );
        profiles.collect(profile).forEach(System.out::println);
    }
}
