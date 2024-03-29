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

    //folder exists
    public static void folderExists(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists()) {
            System.out.println("Folder exists");
        } else {
            System.out.println("Folder not exists");
        }

    }

    //rename folder
    public static void renameFolder(String oldFolderPath, String newFolderPath) {
        File oldFolder = new File(oldFolderPath);
        File newFolder = new File(newFolderPath);
        if (oldFolder.exists()) {
            oldFolder.renameTo(newFolder);
            System.out.println("Folder is renamed to " + newFolder);
        } else {
            System.out.println("Folder does not exist!!");
        }
    }

    //delete folder
    public static void deleteFolder(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            System.out.println("Folder does not exists with this name: " + folder);
        } else {
            for (File file : folder.listFiles()) {
                file.delete();
            }
            folder.delete();
            System.out.println("Folder deleted: " + folderPath);
        }

    }

    public static void main(String[] args) {
        String folderPath = "F:\\Project Workspace\\Utility Operations\\helloFinal";
        createFolder(folderPath);
        folderExists(folderPath);
        String newFolder = "F:\\Project Workspace\\Utility Operations\\helloFinal";
        renameFolder(folderPath, newFolder);
        deleteFolder(folderPath);
    }
}
