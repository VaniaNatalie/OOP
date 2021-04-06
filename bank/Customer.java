package com.company.bank;

public class Customer {
    private String firstname;
    private String lastname;
    private Account account;

    public Customer(){}

    public Customer(String f, String l) {
        firstname = f;
        lastname = l;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        account = acct;
    }
}
