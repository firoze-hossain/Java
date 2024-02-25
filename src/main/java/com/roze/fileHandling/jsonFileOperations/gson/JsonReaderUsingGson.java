package com.roze.fileHandling.jsonFileOperations.gson;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class JsonReaderUsingGson {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "\\data\\employee.json";
        try {
            FileReader fileReader = new FileReader(filePath);
            Gson gson = new Gson();
            Employee employee = gson.fromJson(fileReader, Employee.class);
            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("Address:- ");
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
