package com.roze.java17.annotations.annotations1;

public class Manager extends Employee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setSalary(10);
    }

    //@Override
    //The use of the @Override annotation did the trick
    public void setSalary(int salary) {
        System.out.println("Manager.setSalary():" + salary);
    }
}

class Employee {
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary():" + salary);
    }
}