package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount hrithiksAccount = new BankAccount();
        hrithiksAccount.depositFunds(8000);
        hrithiksAccount.withdrawFunds(2000);
        System.out.println(hrithiksAccount.getBalance());

        BankAccount billgatesAccount = new BankAccount(1,500000,"Bill Gates","billgates@gmail.com",3125336);
        billgatesAccount.getBalance();
    }

}
