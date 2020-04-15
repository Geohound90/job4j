package ru.job4j.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> rsl = profiles.stream().map(
                profile -> profile.getAddress()
        ).collect(Collectors.toList());
        Comparator<Address> comparator = (left, right) -> left.getCity().compareTo(right.getCity());
        rsl.sort(comparator);
        return rsl;
    }

    public List<Address> filter(List<Address> profiles) {
        List<Address> rsl = profiles.stream().distinct().collect(Collectors.toList());
        return rsl;
    }

    public static void main(String[] args) {
        Profiles profiles = new Profiles();
        List<Profile> profile = List.of(
                new Profile(new Address("Moscow", "Uchinskaya", 10, 30)),
                new Profile(new Address("Bryansk", "Lobnenskaya", 8, 100)),
                new Profile(new Address("Podolsk", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Astrahan", "Dolgoprudnaya", 1, 26)),
                new Profile(new Address("Podolsk", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Podolsk", "Angarskaya", 7, 4))
        );
        List<Address> sorted = profiles.collect(profile);
        profiles.filter(sorted).forEach(System.out::println);
    }
}
