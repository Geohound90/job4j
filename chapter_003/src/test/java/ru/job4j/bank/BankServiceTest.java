package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {
    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("12345", "Maxim Pavlov"));
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("12345"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        Optional<User> user = Optional.of(new User("12345", "Maxim Pavlov"));
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        Optional<User> user = Optional.of(new User("12345", "Maxim Pavlov"));
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.get().getPassport(), new Account("6578", 150D));
        assertThat(bank.findByRequisite("12345", "6578").get().getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        Optional<User> user = Optional.of(new User("12345", "Maxim Pavlov"));
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.get().getPassport(), new Account("6578", 150D));
        bank.addAccount(user.get().getPassport(), new Account("111", 50D));
        bank.transferMoney(user.get().getPassport(), "6578", user.get().getPassport(), "111", 150D);
        assertThat(bank.findByRequisite(user.get().getPassport(), "111").get().getBalance(), is(200D));
    }
}
