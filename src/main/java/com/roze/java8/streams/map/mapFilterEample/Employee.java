package com.roze.java8.streams.map.mapFilterEample;

public class Employee {
    private int id;
    private String name;
    private String email;
    private double salary;
    private String phone;

    public Employee(int id, String name, String email, double salary, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary='" + salary + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
