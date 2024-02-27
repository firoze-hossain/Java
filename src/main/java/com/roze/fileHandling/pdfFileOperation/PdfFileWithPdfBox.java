package com.roze.fileHandling.pdfFileOperation;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfFileWithPdfBox {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/data/sample.pdf");
        try {
            //  PDDocument pdDocument = PDDocument.load(file);// <version>2.0.29</version>
            PDDocument pdDocument = Loader.loadPDF(file);//<version>3.0.1</version>
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            String text = pdfTextStripper.getText(pdDocument);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
