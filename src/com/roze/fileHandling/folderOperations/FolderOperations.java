package com.roze.fileHandling.folderOperations;

import java.io.File;

public class FolderOperations {
    public static void createFolder(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        }
        System.out.println("Folder Created Successfully " + folderPath);
    }

    public static void main(String[] args) {
        String folderPath = "F:\\Project Workspace\\Utility Operations\\hello";
        createFolder(folderPath);
    }
}
