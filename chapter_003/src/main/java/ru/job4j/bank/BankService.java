package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        List<User> user = findByPassport(passport);
        if (user.size() != 0) {
            if (findByRequisite(passport, account.getRequisite()).size() == 0) {
                users.get(user.get(0)).add(account);
            }
        }
    }

    public List<User> findByPassport(String passport) {
        List<User> user = users.keySet().stream()
                .filter(pass -> pass.getPassport().equals(passport))
                .collect(Collectors.toList());
        return user;
    }

    public List<Account> findByRequisite(String passport, String requisite) {
        List<User> user = findByPassport(passport);
        List<Account> account = null;
        if (user.size() != 0) {
            account = users.get(user.get(0)).stream()
                    .filter(req -> req.getRequisite().equals(requisite))
                    .collect(Collectors.toList());
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        List<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        List<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.size() != 0 && destAccount.size() != 0 && (srcAccount.get(0).getBalance() >= amount)) {
            destAccount.get(0).setBalance(destAccount.get(0).getBalance() + amount);
            srcAccount.get(0).setBalance(srcAccount.get(0).getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }

}
