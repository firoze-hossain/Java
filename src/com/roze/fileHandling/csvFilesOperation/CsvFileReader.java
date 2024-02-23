package com.roze.fileHandling.csvFilesOperation;

import java.io.*;
import java.util.Scanner;

public class CsvFileReader {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir") + "//data//hello.csv");
        //method 1: raed file using scanner class
//        try {
//            Scanner scanner = new Scanner(file);
//            scanner.useDelimiter(",");
//            while (scanner.hasNext()) {
//                System.out.print(scanner.next() + "\t");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //method 2: read file using BufferedReader and split() method
        try {
            FileReader filePath = new FileReader(System.getProperty("user.dir") + "//data//hello.csv");

            BufferedReader bufferedReader = new BufferedReader(filePath);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String data[] = line.split(",");
                for (String value : data) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
