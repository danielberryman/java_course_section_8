package com.daniel;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if(doesBranchExist(name) != -1 ) {
            new Branch(name);
            return true;
        }
        return false;
    }

    public boolean addCustomerToBranch(String branchName, String name, double amount) {
        int index = doesBranchExist(branchName);
        if(index != -1) {
            return this.branches.get(index).addCustomer(name, amount);
        }
        return false;
    }

    public boolean addTransactionForBranchCustomer(String branchName, String name, double amount) {
        int branchIndex = doesBranchExist(branchName);
        if(branchIndex != -1) {
            return this.branches.get(branchIndex).addTransaction(name, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        int index = doesBranchExist(branchName);
        if(index != -1) {

        }
        return false;
    }

    private int doesBranchExist(String name) {
        for (int i=0; i<branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }
}
