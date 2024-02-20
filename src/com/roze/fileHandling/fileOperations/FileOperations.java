package com.roze.fileHandling.fileOperations;

import java.io.File;
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

    public static void main(String[] args) {
        String filePath = "/home/firoze/Project Workspace/Utils Opeartions/";
        createNewFile(filePath + "file.txt");
    }
}
