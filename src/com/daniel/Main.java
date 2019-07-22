package com.daniel;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Wells Fargo");

        bank.addBranch("Indianapolis");

        bank.addCustomerToBranch("Indianapolis", "Daniel", 100.50);
        bank.addCustomerToBranch("Indianapolis", "Grace", 150.75);

        bank.addBranch("Seattle");
        bank.addCustomerToBranch("Seattle", "Jeff", 1000.45);

    }
}
