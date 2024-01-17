package com.roze.java17.annotations.annotations1;

public class Manager extends Employee {
    public static void main(String[] args) {
        Employee employee = new Manager();
        employee.setSalary(10);
    }

    //@Override
    //The use of the @Override annotation did the trick
//    public void setSalary(int salary) {
//        System.out.println("Manager.setSalary():" + salary);
//    }

    @Override
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary():" + salary);
    }
}

class Employee {
    public void setSalary(double salary) {
        System.out.println("Manager.setSalary():" + salary);
    }
}