package com.roze.fileHandling.xmlFileOperation;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

//DOM->Document Object Model
//read xml file by using java dom parser
public class XmlFileRead {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            //convert xml file to document
            Document document = builder.parse(System.getProperty("user.dir") + "/data/books.xml");
            //get root node
            Node rootNode = document.getDocumentElement();
            //get all child nodes list
            System.out.println("Root Element: " + rootNode.getNodeName());
            NodeList nodeList = rootNode.getOwnerDocument().getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node nodeItem = nodeList.item(i);
                System.out.println("\nCurrent Element: " + nodeItem.getNodeName());
                if (nodeItem.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodeItem;
                    System.out.println("Book Id: " + element.getAttribute("id"));
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Genre: " + element.getElementsByTagName("genre").item(0).getTextContent());
                    System.out.println("Price: " + element.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("Publish Date: " + element.getElementsByTagName("publish_date").item(0).getTextContent());
                    System.out.println("Description: " + element.getElementsByTagName("description").item(0).getTextContent());

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
