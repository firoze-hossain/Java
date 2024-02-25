package com.roze.fileHandling.jsonFileOperations.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonFileRead {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = System.getProperty("user.dir") + "/data/employee.json";
        File file = new File(filePath);
        try {
            Employee employee = objectMapper.readValue(file, Employee.class);
            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("Address: ");
            for (Address address : employee.getAddress()) {
                System.out.println("Street: " + address.getStreet());
                System.out.println("City: " + address.getCity());
                System.out.println("State: " + address.getState());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
