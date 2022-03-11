package com.bharath.xmlparsers.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SAXParserDemo {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		SAXParser parser = parserFactory.newSAXParser();

		SAXHandler handler = new SAXHandler();
		parser.parse(ClassLoader.getSystemResourceAsStream("xml/DriversLicense.xml"), handler);
		System.out.println(handler.getDriversLicense().getFirstName());
		System.out.println(handler.getDriversLicense().getLastName());
		System.out.println(handler.getDriversLicense().getNumber());
	}
}
