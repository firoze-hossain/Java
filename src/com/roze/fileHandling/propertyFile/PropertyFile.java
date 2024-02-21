package com.roze.fileHandling.propertyFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("Name", "Md. Firoze Hossain");
        properties.setProperty("Email", "firoze.hossain01@gmail.com");
        properties.setProperty("Mobile", "01714271620");
        String filePath = System.getProperty("user.dir") + "/data/hello.properties";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            properties.store(fileOutputStream, "Hello Firoze");
            fileOutputStream.close();
            System.out.println("Properties has been written into: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
