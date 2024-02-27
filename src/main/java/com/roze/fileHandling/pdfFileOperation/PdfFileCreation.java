package com.roze.fileHandling.pdfFileOperation;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;

public class PdfFileCreation {
    public static void main(String[] args) {
        //create document
        PDDocument document = new PDDocument();
        //create new page with size(layout)
        PDPage pdPage = new PDPage(PDRectangle.A4);
        //add page to document
        document.addPage(pdPage);
        //write content in the page
        try {
            PDPageContentStream pdContentStream = new PDPageContentStream(document, pdPage);
            //set font and size
            //   pdContentStream.setFont(PDType1Font.COURIER, 14);// <version>2.0.29</version>
            pdContentStream.setFont(new PDType1Font(Standard14Fonts.FontName.COURIER), 14); //<version>3.0.1</version>
            pdContentStream.beginText();
            pdContentStream.newLineAtOffset(60, 700);
            pdContentStream.showText("Hello Firoze. How are you");
            pdContentStream.endText();
            pdContentStream.close();
            document.save(System.getProperty("user.dir") + "/data/k.pdf");
            System.out.println("Pdf file created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
