package coches;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class SAX {
	 public static void main(String[] args) {

	        try {

	            // Locate the file
	            FileInputStream fileInputStream = new FileInputStream(new File("salida\\concesionario.xml"));

	            // Parse the file
	            List<coches> Coches = parsearXml(fileInputStream);

	            // Verify the result
	            System.out.println(Coches);

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	    }

	    private static List<coches> parsearXml(InputStream in)
	    {
	        // Create a empty link of alumnos initially
	        List<coches> concesionario = new ArrayList<coches>();
	        try
	        {
	            // Create default handler instance
	            Manejador handler = new Manejador();

	            // Create parser from factory
	            XMLReader xmlReader = XMLReaderFactory.createXMLReader();

	            // Register handler with parser
	            xmlReader.setContentHandler(handler);

	            // Create an input source from the XML input stream
	            InputSource source = new InputSource(in);

	            // parse the document
	            xmlReader.parse(source);

	            // populate the parsed users list in above created empty list; You can return from here also.
	            concesionario = handler.getcoches();//es la lista creada en el manejador

	        } catch (SAXException e) {

	            e.printStackTrace();
	        } catch (IOException e) {

	            e.printStackTrace();
	        }

	        return concesionario;
	    }
}
