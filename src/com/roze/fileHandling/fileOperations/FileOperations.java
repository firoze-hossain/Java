package com.roze.fileHandling.fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error occured while reading file");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String filePath = "/home/firoze/Project Workspace/Utils Opeartions/file.txt";
        // createNewFile(filePath);
        //  writeFile(filePath);
        readFile(filePath);
    }
}
