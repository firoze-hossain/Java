package com.roze.fileHandling.fileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void createNewFile(String filePath) {
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File is created: " + file.getName());
            } else {
                System.out.println("File is already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String filePath) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write("Welcome to Java again");
            System.out.println("File is written successfully");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String filePath = "/home/firoze/Project Workspace/Utils Opeartions/file.txt";
        createNewFile(filePath);
        writeFile(filePath);
    }
}
