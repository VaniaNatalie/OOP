package com.company.bank;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int choice;

        /* Menu */
        System.out.println("Bank Menu");
        // Adding bank name
        System.out.println("Add bank name: ");
        String bankname = obj.next();
        Bank bank = new Bank(bankname);

        do{
            System.out.println("1. Add customers ");
            System.out.println("2. Get customers info by index ");
            System.out.println("3. Get total number of customers ");
            System.out.println("4. Deposit ");
            System.out.println("5. Withdraw ");
            System.out.println("6. Exit ");
            System.out.print("What do you want to do? ");

            choice = obj.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter first name: ");
                    String f = obj.next();
                    System.out.print("Enter last name: ");
                    String l = obj.next();
                    System.out.print("Enter amount of balance: ");
                    double b = obj.nextDouble();
                    bank.addCustomer(f, l, b);
                    break;

                case 2:
                    System.out.print("Insert the index of the customer: ");
                    int index = obj.nextInt();
                    Customer cust = bank.getCustomer(index);
                    System.out.println("Name: " + cust.getFirstname() + cust.getLastname());
                    System.out.println("Balance: " + cust.getAccount().getBalance());
                    break;

                case 3:
                    System.out.println("The number of customer(s) is/are " + bank.getNumberOfCustomers());
                    break;

                case 4:
                    System.out.print("Enter your ID: ");
                    int id = obj.nextInt();
                    System.out.print("Enter amount of deposit: ");
                    double d = obj.nextDouble();
                    Customer curcust = bank.getCustomer(id);
                    curcust.getAccount().deposit(d);
                    double balance = curcust.getAccount().getBalance();
                    System.out.println("Your current balance is "+ balance);
                    break;

                case 5:
                    System.out.print("Enter your ID: ");
                    int id2 = obj.nextInt();
                    System.out.print("Enter amount of withdrawal: ");
                    double w = obj.nextDouble();
                    Customer curcust2 = bank.getCustomer(id2);
                    curcust2.getAccount().withdraw(w);
                    double balance2 = curcust2.getAccount().getBalance();
                    System.out.println("Your current balance is "+ balance2);
                    break;
            }
        } while(choice != 6);
        System.out.println("Thankyou for using "+ bankname);
    }
}
