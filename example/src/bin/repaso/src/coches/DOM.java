package coches;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;




public class DOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Document document = parsearXml(new File("salida\\concesionario.xml"));//creo el documento de la libreria DOM y digo donde esta

		       
		 
		        List<coches> Concesionario = recorrerDom(document);
		        System.out.println(Concesionario);
		        
		    }

		    public static Document parsearXml(File fichero) {//parseo el fichero con la libreria DOM

		        Document document = null; //doc es de tipo Document y representa al árbol DOM

		        try{

		            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		            DocumentBuilder builder = factory.newDocumentBuilder();

		            document = builder.parse(fichero); // Ahora document apunta al árbol DOM listo para ser recorrido.

		        }catch(Exception e){

		            System.out.println("ERROR al abrir el documento XML DOM: " + fichero.getPath());
		        }

		        return document;
		    }

		    
		    public static List<coches> recorrerDom(Document document) {

		        List<coches> Concesionario = new ArrayList<coches>();//creo la lista Concesionario de la clase padre coches y le agregare el pojo de coches

		        NodeList ListaCoches = document.getElementsByTagName("coche");//Exception in thread "main" java.lang.NumberFormatException: For input string: "" porque el nombre por el que empieza el XML esta mal escrito
//o te saldran los corchetes en blanco
		        for (int i = 0; i < ListaCoches.getLength(); i++)
		        {
		            Node node = ListaCoches.item(i);

		            if (node.getNodeType() == Node.ELEMENT_NODE)
		            {
		                Element nodoCoche = (Element) node;

		                coches Coche = new coches(//puede dar fallo al crearlo porque el orden no este bien en el constructor asique cambias el orden en el constructor
		                        Integer.parseInt(nodoCoche.getAttribute("id")),//este id habria que cambiarlo a String tambien en el constructor si utilizo el XML creado a partir del JSON
		                        nodoCoche.getElementsByTagName("marca").item(0).getTextContent(),
		                        nodoCoche.getElementsByTagName("color").item(0).getTextContent(),
		                        nodoCoche.getElementsByTagName("kilometros").item(0).getTextContent()//si no tiene las comillas se toma por string porque en el int da error
		                );

		                Concesionario.add(Coche);
		            }
		        }

		        return Concesionario;
		    }

	}

