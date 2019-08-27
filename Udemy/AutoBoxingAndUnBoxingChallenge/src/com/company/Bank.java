package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;

    ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }


    public Branch findBranch(String branchName){
        for(Branch branch:branches){
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
}
