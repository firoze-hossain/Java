package com.roze.interviewQAndAns.memoryManagement.valuesAndReferences.example2;

public class Customer {
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getName1() {
        String temp = this.name;
        this.name = "Millat";
        return temp;
    }

    public void setName(String name) {
        this.name = name;
    }
}
