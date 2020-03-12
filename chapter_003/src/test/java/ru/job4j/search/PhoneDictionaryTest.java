package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Maxim", "Pavlov", "896543", "Moskva")
        );
        ArrayList<Person> persons = phones.find("Maxim");
        assertThat(persons.get(0).getSurname(), is("Pavlov"));
    }
}
