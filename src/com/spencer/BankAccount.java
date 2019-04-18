package com.spencer;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //-------- Getters ----------/
    protected int getAccountNumber() {
        return this.accountNumber;
    }

    protected double getBalance() {
        return this.balance;
    }

    protected String getCustomerName() {
        return this.customerName;
    }

    protected String getEmail() {
        return this.email;
    }

    protected int getPhoneNumber() {
        return this.phoneNumber;
    }

    //-------- Setters ----------/
    protected void  setAccountNumber(int number) {
        this.accountNumber = number;
    }

    protected void setBalance(double amount) {
        this.balance = amount;
    }

    protected void setCustomerName(String name) {
        this.customerName = name;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setPhoneNumber(int number) {
        this.phoneNumber = number;
    }

    //--------------- Methods -----------/
    protected void depositFunds(double amount) {
        this.balance = this.balance + amount;
        System.out.println("New balance = " + this.balance);
    }

    protected void withdrawFunds(double number) {
        if (this.balance - number < 0) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance = this.balance - number;
        System.out.println("New balance = " + this.balance);
    }

}
