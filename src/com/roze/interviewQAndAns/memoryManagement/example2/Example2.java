package com.roze.interviewQAndAns.memoryManagement.example2;

public class Example2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Firoze");
        renameCustomer(customer);
        System.out.println(customer.getName());
    }

    public static void renameCustomer(Customer customer) {
        customer.setName("Hossain");
    }
}
