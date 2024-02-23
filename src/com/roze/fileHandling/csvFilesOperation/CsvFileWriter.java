package com.roze.fileHandling.csvFilesOperation;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriter {
    public static void main(String[] args) {
        String csvFilePath = System.getProperty("user.dir") + "\\data\\hello.csv";
        try {
            FileWriter fileWriter = new FileWriter(csvFilePath);
            fileWriter.append("Name,Age, Email\n");//header
            //data insert
            fileWriter.append("Firoze,29,firoze@gmail.com\n");
            fileWriter.append("Rayhan,30,rayhan@gmal.com\n");
            fileWriter.append("Millat,28,millat@gmail.com\n");
            fileWriter.append("Imtiaze,29,imtiaze@gmail.com");
            fileWriter.close();
            System.out.println("Csv file created at: " + csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
