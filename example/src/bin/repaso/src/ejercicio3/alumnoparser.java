package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import repasodatos.alumno;
import repasodatos.grupo;



	public class alumnoparser extends DefaultHandler{
		 private List<alumno> alumnos = new ArrayList<alumno>();

		    // As we read any XML element we will push that in this stack
		    private Stack elementStack = new Stack();

		    // As we complete one user block in XML, we will push the User instance in alumnos
		    private Stack objectStack = new Stack();

		    @Override
		    public void startDocument() throws SAXException
		    {
		        //System.out.println("start of the document   : ");
		    }

		    @Override
		    public void endDocument() throws SAXException
		    {
		        //System.out.println("end of the document document     : ");
		    }

		    /*
		     * Se invoca cuando SAX detecta un evento de comienzo de un Elemento.
		     */
		    @Override
		    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
		    {
		        // Push it in element stack
		        this.elementStack.push(qName);

		        // If this is start of 'alumno' element then prepare a new ficherocaracteres.dominio.Alumno instance and push it in object stack
		        if ("alumno".equals(qName))
		        {
		            //New User instance
		            alumno alumno = new alumno();

		            //Set all required attributes in any XML element here itself
		            if(attributes != null && attributes.getLength() == 1)
		            {
		                alumno.setId(Integer.parseInt(attributes.getValue(0)));
		            }
		            this.objectStack.push(alumno);
		        }
		    }

		    /*
		     * Se invoca cuando SAX detecta un evento de finalización de un Elemento.
		     */
		    @Override
		    public void endElement(String uri, String localName, String qName) throws SAXException
		    {
		        // Remove last added  element
		        this.elementStack.pop();

		        // ficherocaracteres.dominio.Alumno instance has been constructed so pop it from object stack and push in alumnos
		        if ("alumno".equals(qName))
		        {
		            alumno object = (alumno) this.objectStack.pop();
		            this.alumnos.add(object);
		        }
		    }

		    /*
		     * This will be called everytime parser encounter a value node
		     */
		    @Override
		    public void characters(char[] ch, int start, int length) throws SAXException
		    {
		        String value = new String(ch, start, length).trim();

		        if (value.length() == 0)
		        {
		            return; // ignore white space
		        }

		        // handle the value based on to which element it belongs
		        if ("nombre".equals(currentElement()))
		        {
		            alumno alumno = (alumno) this.objectStack.peek();
		            alumno.setNombre(value);
		        }
		        else if ("apellidos".equals(currentElement()))
		        {
		            alumno alumno = (alumno) this.objectStack.peek();
		            alumno.setApellido(value);
		        }
		        else if ("grupo".equals(currentElement()))
		        {
		            alumno alumno = (alumno) this.objectStack.peek();
		            alumno.setCurso(grupo.valueOf(value));
		        }
		        else if ("fecha_nacimiento".equals(currentElement()))
		        {
		            alumno alumno = (alumno) this.objectStack.peek();
		            alumno.setFecha(value);
		        }
		    }

		    /*
		     * Utility method for getting the current element in processing
		     */
		    private String currentElement()
		    {
		        return (String) this.elementStack.peek();
		    }

		    // Accessor for alumnos object
		    public List<alumno> getAlumnos()
		    {
		        return alumnos;
		    }
		
}
