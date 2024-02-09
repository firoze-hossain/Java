package com.roze.java8.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    private String name;
    private double salary;
    private String gender;

    public Employee(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Firoze", 55000, "Male"),
                new Employee("Afsana", 50000, "Female"),
                new Employee("Shajib", 60000, "Male"),
                new Employee("Mim", 45000, "Female"),
                new Employee("Noyon", 47000, "Male")
        );
        Function<Employee, Double> f = n -> (n.getSalary() * 10) / 100;
        Predicate<Double> p = n -> (n >= 5000);
        Consumer<Employee> c = n -> {
            System.out.println("Salary: " + n.getSalary() + " Gender: " + n.getGender());
        };

        for (Employee emp : employeeList) {
            double bonus = f.apply(emp);
            if (p.test(bonus)) {
                System.out.println("Details of " + emp.getName() + ":");
                c.accept(emp);
                System.out.println("Bonus: " + bonus);
                System.out.println();
            }
        }
    }


}