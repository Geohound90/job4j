package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenCollect() {
        Profiles profiles = new Profiles();
        List<Profile> profile = List.of(
                new Profile(new Address("Moscow", "Uchinskaya", 10, 30)),
                new Profile(new Address("Bryansk", "Lobnenskaya", 8, 100)),
                new Profile(new Address("Podolsk", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Astrahan", "Dolgoprudnaya", 1, 26)),
                new Profile(new Address("Podolsk", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Podolsk", "Angarskaya", 7, 4))
        );
        List<Address> result = profiles.collect(profile);
        List<Address> expected = List.of(
                new Address("Moscow", "Uchinskaya", 10, 30),
                new Address("Bryansk", "Lobnenskaya", 8, 100),
                new Address("Podolsk", "Ikshinskaya", 16, 45),
                new Address("Astrahan", "Dolgoprudnaya", 1, 26),
                new Address("Podolsk", "Ikshinskaya", 16, 45),
                new Address("Podolsk", "Angarskaya", 7, 4)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortedAndWithoutDuplicates() {
        Profiles profiles = new Profiles();
        List<Profile> profile = List.of(
                new Profile(new Address("Moscow", "Uchinskaya", 10, 30)),
                new Profile(new Address("Bryansk", "Lobnenskaya", 8, 100)),
                new Profile(new Address("Podolsk", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Astrahan", "Dolgoprudnaya", 1, 26)),
                new Profile(new Address("Podolsk", "Ikshinskaya", 16, 45)),
                new Profile(new Address("Podolsk", "Angarskaya", 7, 4))
        );
        List<Address> result = profiles.collect(profile);
        List<Address> expected = List.of(
                new Address("Astrahan", "Dolgoprudnaya", 1, 26),
                new Address("Bryansk", "Lobnenskaya", 8, 100),
                new Address("Moscow", "Uchinskaya", 10, 30),
                new Address("Podolsk", "Angarskaya", 7, 4),
                new Address("Podolsk", "Ikshinskaya", 16, 45)
        );
        assertThat(result, is(expected));
    }
}
