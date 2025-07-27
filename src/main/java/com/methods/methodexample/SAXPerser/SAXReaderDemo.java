package com.methods.methodexample.SAXPerser;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
 
public class SAXReaderDemo {
     public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxperser = factory.newSAXParser();
            
            Bookhandler handler = new Bookhandler();
            saxperser.parse("F:\\JAVA\\XML\\book.xml", handler);
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }
    }
}
