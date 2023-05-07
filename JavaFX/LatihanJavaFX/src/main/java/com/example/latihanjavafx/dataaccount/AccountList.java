package com.example.latihanjavafx.dataaccount;

import java.util.ArrayList;

public class AccountList {
    private ArrayList<Account> accounts = new ArrayList<>();

    public AccountList() {
        accounts.add(new Account("user1", "1234"));
        accounts.add(new Account("user2", "4321"));
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
