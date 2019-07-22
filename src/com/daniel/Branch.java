package com.daniel;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void listCustomers(String name) {
        int index = doesCustomerExist(name);
        if(index != -1) {
            for (int i=0; i<this.customers.size(); i++) {
                Customer customer = this.customers.get(i);
                System.out.println("Customer " + (i+1) + ": " + customer.getName());
            }
        } else {
            System.out.println("No existing customer in this branch of the bank.");
        }
    }

    public void listCustomerTransactions(String name) {
        int index = doesCustomerExist(name);
        if(index != -1) {
            Customer customer = this.customers.get(index);
            customer.listTransactions();
        }
    }

    public boolean addCustomer(String name, double transactions) {
        if(doesCustomerExist(name) != -1) {
            this.customers.add(new Customer(name, transactions));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String name, double amount) {
        int index = doesCustomerExist(name);
        if(index != -1) {
            Customer customer = this.customers.get(index);
            customer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private int doesCustomerExist(String name) {
        for(int i=0; i<customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
