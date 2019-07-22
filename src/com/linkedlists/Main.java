package com.linkedlists;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Lists we've talked about: arrays & ArrayLists
//        4 bytes of memory for each integer
//        8 bytes for doubles
//        primitive always consume the same amount of memory
//        Strings are different: 8 bytes store another address to the String
//        garbage collection releases memory
//        actual string addresses don't need to be contiguous

        Customer customer = new Customer("Daniel", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i< intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for(int i=0; i< intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }



    }
}
