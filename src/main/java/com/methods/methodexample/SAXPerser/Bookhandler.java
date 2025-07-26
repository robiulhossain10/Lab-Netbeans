package com.methods.methodexample.SAXPerser;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author A-3
 */
public class Bookhandler extends DefaultHandler {

    boolean bTitle = false;
    boolean bAuthor = false;
    boolean bPrice = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("book")) {
            String id = attributes.getValue("id");
            System.out.println("Book ID: " + id);
        } else if (qName.equalsIgnoreCase("title")) {
            bTitle = true;
        } else if (qName.equalsIgnoreCase("author")) {
            bAuthor = true;
        } else if (qName.equalsIgnoreCase("price")) {
            bPrice = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bTitle) {
            System.out.println("Title: " + new String(ch, start, length));
            bTitle = false;
        } else if (bAuthor) {
            System.out.println("Author: " + new String(ch, start, length));
            bAuthor = false;
        } else if (bPrice) {
            System.out.println("Price: " + new String(ch, start, length));
            bPrice = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("book")) {
            System.out.println("---------------------------------");
        }
    }
    


}


