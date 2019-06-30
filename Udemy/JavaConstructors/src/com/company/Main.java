package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Bob",25000.0);
        System.out.println(vipCustomer2.name);
        System.out.println(vipCustomer2.creditLimit);
        System.out.println(vipCustomer2.emailAddress);
    }
}
