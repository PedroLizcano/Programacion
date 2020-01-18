package ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import repasodatos.alumno;
import repasodatos.grupo;



public class leerxmlDOM {


	public static void main(String[] args) {

		Document document = parsearXml(new File("E:\\repaso\\salida\\alumnos.xml"));

		// OPCIONAL: validar el fichero con un esquema 'alumnos.xsd'


		List<alumno> alumnos = recorrerDom(document);

		System.out.println(alumnos.toString());
	}

	public static Document parsearXml(File fichero) {

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


	public static List<alumno> recorrerDom(Document document) {

		List<alumno> alumnos = new ArrayList<alumno>();

		NodeList listaNodosAlumno = document.getElementsByTagName("alumno");

		for (int i = 0; i < listaNodosAlumno.getLength(); i++)
		{
			Node node = listaNodosAlumno.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element nodoAlumno = (Element) node;

				alumno Alumno = new alumno(
						Integer.parseInt(nodoAlumno.getAttribute("id")),
						nodoAlumno.getElementsByTagName("nombre").item(0).getTextContent(),
						nodoAlumno.getElementsByTagName("apellidos").item(0).getTextContent(),
						grupo.valueOf(nodoAlumno.getElementsByTagName("grupo").item(0).getTextContent()),
						nodoAlumno.getElementsByTagName("fecha_nacimiento").item(0).getTextContent()
						);

				alumnos.add(Alumno);
			}
		}

		return alumnos;
	}





}
