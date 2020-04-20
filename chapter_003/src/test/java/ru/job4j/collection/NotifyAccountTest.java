package ru.job4j.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Maxim Pavlov", "aTerc7822g"),
                new Account("321", "Maxim Pavlov", "0001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                    new Account("123", "Maxim Pavlov", "aTerc7822g"),
                    new Account("321", "Maxim Pavlov", "0001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void deleteDuplicatePassport() {
        List<Account> accounts = List.of(
                new Account("123", "Maxim Pavlov", "aTerc7822g"),
                new Account("321", "Maxim Pavlov", "0001"),
                new Account("321", "Maxim Pavlov", "3211")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Maxim Pavlov", "aTerc7822g"),
                        new Account("321", "Maxim Pavlov", "0001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

}
