package com.roze.interviewQAndAns.memoryManagement.valuesAndReferences.example2;

public class Example2 {
    public static void main(String[] args) {
        //  Customer customer = new Customer("Firoze");
        // use of final keyword
        final Customer customer = new Customer("Firoze");
        // customer is reference variable on stack which is pointing a object in heap
        //we can not change value by using -->customer=new Customer("Hossain") this
        // because customer is a variable in stack which is defined by final keyword
        // but we can change it in heap -->customer.setName("Hossain");
        customer.setName("Hossain");
       // renameCustomer(customer);
        System.out.println(customer.getName());
    }

    public static void renameCustomer(Customer customer) {
        customer.setName("Hossain");
    }
}
