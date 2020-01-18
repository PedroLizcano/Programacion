package ejercicio3;

import jdk.internal.org.xml.sax.SAXException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;

import org.xml.sax.helpers.DefaultHandler;

public class leerxml {
	 public static void main(String argv[]) {

		    try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

			boolean bfname = false;
			boolean blname = false;
			boolean bnname = false;
			boolean bsalary = false;
			boolean bfecha =false;

			public void startElement(String uri, String localName,String qName, 
		                Attributes attributes) {

				System.out.println("Start Element :" + qName);

				if (qName.equalsIgnoreCase("ID")) {
					bfname = true;
				}

				if (qName.equalsIgnoreCase("NAME")) {
					blname = true;
				}

				if (qName.equalsIgnoreCase("NICKNAME")) {
					bnname = true;
				}

				if (qName.equalsIgnoreCase("CURSO")) {
					bsalary = true;
				}
				if (qName.equalsIgnoreCase("FECHA")) {
					bfecha = true;
				}

			}

			public void endElement(String uri, String localName,
				String qName) {

				System.out.println("End Element :" + qName);

			}

			public void characters(char ch[], int start, int length)  {

				if (bfname) {
					System.out.println("id : " + new String(ch, start, length));
					bfname = false;
				}

				if (blname) {
					System.out.println("nombre : " + new String(ch, start, length));
					blname = false;
				}

				if (bnname) {
					System.out.println("apellido : " + new String(ch, start, length));
					bnname = false;
				}

				if (bsalary) {
					System.out.println("curso : " + new String(ch, start, length));
					bsalary = false;
				}
				if (bfecha) {
					System.out.println("fecha: " + new String(ch, start, length));
					bfecha = false;
				}

			}

		     };

		       saxParser.parse("salida\\alumnos.xml", handler);
		 
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		  
		   }

		}

