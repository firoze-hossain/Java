package com.roze.fileHandling.propertyFile;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertyFile {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("Name", "Firoze");
        properties.setProperty("Email", "firoze.hossain01@gmail.com");
        properties.setProperty("Age", "26");
        String filePath = System.getProperty("user.dir") + "/data/tuk.properties";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            properties.store(fileOutputStream, "Hello Java");
            fileOutputStream.close();
            System.out.println("Properties file created: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
