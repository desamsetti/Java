package com.company;

public class VipCustomer {
    String name;
    Double creditLimit;
    String emailAddress;

    public VipCustomer(){
        this("Default name",50000.0,"default@email.com");
    }

    public VipCustomer(String name, Double creditLimit){
        this(name,creditLimit,"unknown@email.com");
    }

    public VipCustomer(String name, Double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
