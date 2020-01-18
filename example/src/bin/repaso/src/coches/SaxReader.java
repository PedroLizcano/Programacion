package coches;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxReader extends DefaultHandler{

    public void startDocument() throws SAXException {
        //avisa de que empieza a leer el documento
    }
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        //avisa de que empieza a leer elemento y nos pasa la info
    }
    public void characters(char[] arg0, int start, int length) throws SAXException {
        //nos pasa el contenido de un elemento
    }
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        //avisa cuando acaba un elemento y nos pasa la info
    }
    public void endDocument() throws SAXException {
        //avisa cuando acaba el documento
    }
}
