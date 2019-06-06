package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        if(amount>0) {
            this.balance += amount;
            System.out.println("Deposited " + amount);
        }
    }


    public void withdrawFunds(double amount){
        if(this.balance-amount>0){
            this.balance -= amount;
        }
        else{
            System.out.println("Insufficicent Funds");
        }
    }



}
