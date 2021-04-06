package com.company.bank;

public class Bank {
    private java.util.ArrayList<Customer> customers = new java.util.ArrayList<Customer>();
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bName){
        bankName = bName;
    }

    public void addCustomer(String f, String l, double balance){
        Account acc = new Account(balance);
        customers.add(new Customer(f,l));
        int index = customers.size()-1;
        Customer cust = customers.get(index);
        cust.setAccount(acc);
        System.out.printf("Your ID is: %d, please use it to login later\n", customers.size()-1);
    }

    public int getNumberOfCustomers() {
        numberOfCustomers = customers.size();
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }
}
