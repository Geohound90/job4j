package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("12345", "Maxim Pavlov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("12345"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("12345", "Maxim Pavlov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        User user = new User("12345", "Maxim Pavlov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("6578", 150D));
        assertThat(bank.findByRequisite("12345", "6578").getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        User user = new User("12345", "Maxim Pavlov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("6578", 150D));
        bank.addAccount(user.getPassport(), new Account("111", 50D));
        bank.transferMoney(user.getPassport(), "6578", user.getPassport(), "111", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "111").getBalance(), is(200D));
    }
}
