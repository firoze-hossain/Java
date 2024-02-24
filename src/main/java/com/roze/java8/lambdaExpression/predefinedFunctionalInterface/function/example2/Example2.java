package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.function.example2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    private String ename;
    private double salary;

    public Employee(String ename, double salary) {
        this.ename = ename;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Example2 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Firoze", 55000),
                new Employee("Rayhan", 40000),
                new Employee("Noyon", 25000),
                new Employee("Millat", 60000)
        );
        Function<Employee, Double> b = sal -> {
            double s = sal.getSalary();
            if (s > 10000 && s <= 20000) {
                return (s * 10 / 100);
            } else if (s > 20000 && s <= 30000) {
                return (s * 20 / 100);
            } else if (s > 30000 && s <= 40000) {
                return (s * 30 / 100);
            } else if (s > 40000 && s <= 50000) {
                return (s * 35 / 100);
            } else if (s > 50000 && s <= 60000) {
                return (s * 38 / 100);
            } else {
                return (s * 40 / 100);
            }

        };

        Predicate<Double> p = i -> (i > 5000);
        for (Employee emp : employeeList) {
            double bonus = b.apply(emp);
            if (p.test(bonus)) {
                System.out.println(emp.getEname() + " " + emp.getSalary());
                System.out.println("Bonus is: " + bonus);
            }
        }
    }
}
