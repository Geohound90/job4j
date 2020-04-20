package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Maxim", "Pavlov", "896543", "Moskva")
        );
        var persons = phones.find("Maxim");
        assertThat(persons.get(0).getSurname(), is("Pavlov"));
    }
}
