package com.roze.fileHandling.propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {
    public static void main(String[] args) {
        Properties properties = new Properties();

        String filePath = System.getProperty("user.dir") + "/data/tuk.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
            fileInputStream.close();
            //get value by using key(method 1)
            String age = properties.getProperty("Age");
            String name = properties.getProperty("Name");
            String email = properties.getProperty("Email");
            System.out.println(age + " " + name + " " + email);

            //get only key or properties using stringPropertyNames()
            Set<String> keyString = properties.stringPropertyNames();
            System.out.println(keyString);
            //get only key or properties using keySet()
            Set<Object> keysObject = properties.keySet();
            System.out.println(keysObject);
            //get only values with values() method
            Collection<Object> valuesCollect = properties.values();
            System.out.println(valuesCollect);
            //get key and value together
            for (String key : properties.stringPropertyNames()) {
                System.out.print(key + ":" + properties.getProperty(key) + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
