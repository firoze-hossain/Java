package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.predicate.example3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    private String ename;
    private Integer salary;
    private int experience;

    public Employee(String ename, Integer salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

public class Example3 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Firoze", 55000, 3),
                new Employee("Rayhan", 50000, 4),
                new Employee("Mydul", 30000, 2),
                new Employee("Noyon", 20000, 1),
                new Employee("Millat", 60000, 4)
        );
        Predicate<Employee> pr = e -> (e.getSalary() > 30000 && e.getExperience() > 2);
        for (Employee emp : employeeList) {
            //traditional approach
//            if (emp.getSalary() > 30000 && emp.getExperience() > 2) {
//                System.out.println(emp.getEname() + " " + emp.getSalary() + " " + emp.getExperience());
//            }
            if (pr.test(emp)) {
                System.out.println(emp.getEname() + " " + emp.getSalary() + " " + emp.getExperience());
            }
        }
    }

}
