package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.consumer.example2;

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

public class Exmaple2 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Firoze", 55000, "Male"),
                new Employee("Afsana", 50000, "Female"),
                new Employee("Shajib", 60000, "Male"),
                new Employee("Mim", 45000, "Female"),
                new Employee("Noyon", 47000, "Male")
        );
        //use function, predicate and consumer together
        // use these predefined functional interfaces in object

        // Function(it will take one argument and one return type->have apply()method)
        //return with return typed value
        //find out of 10% bonus of the employee
        Function<Employee, Double> f = n -> (n.getSalary() * 10) / 100;

        //Predicate(use for conditional check, return only boolean value and take one argument)
        // have one abstract method test()
        // find out who's bonus is greater than 5000
        Predicate<Double> p = n -> (n >= 5000);

        //Consumer(it will take one argument and just print the value and does not return anything)
        //it wil just print the properties of employee using employee type's
        Consumer<Employee> c = n -> {
            System.out.println( "Salary: " + n.getSalary() + " Gender: " + n.getGender());
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
