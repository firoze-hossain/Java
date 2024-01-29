package com.roze.java8.streams.map.mapFilterEample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilter {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Firoze", "firoze@gmail.com", 45000, "01714271620"),
                new Employee(2, "Rayhan", "rayhan@gmail.com", 35000, "01737852369"),
                new Employee(3, "Millat", "millat@gmail.com", 70000, "01683962587"),
                new Employee(4, "Imtiaze", "imtiaze@gmail.com", 29000, "01620896352"),
                new Employee(5, "Shajib", "shajib@gmail.com", 20000, "01740259638")
        );
        //employee list which salary is greater than 29000
        List<String> employees = employeeList.stream()
                .filter(emp -> emp.getSalary() > 29000)
                .map(emp -> emp.toString())
                .collect(Collectors.toList());
        System.out.println(employees);

        System.out.println();

        //print salary whose salary is greater than 29000
//        List<Double> salary =
        employeeList.stream()
                .filter(emp -> emp.getSalary() > 29000)
                .map(emp -> emp.getSalary()).forEach(System.out::println);
        //.collect(Collectors.toList());
        // System.out.println(salary);
    }
}
