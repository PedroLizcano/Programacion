package jsontoxml;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class jsontoxml {

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
String json="{\"alumnos\": {\"alumno\": [\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Gómez Pascual\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"03/10/1980\",\r\n" + 
		"            \"id\": 1,\r\n" + 
		"            \"nombre\": \"Hugo\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"González Vázquez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"05/04/1998\",\r\n" + 
		"            \"id\": 2,\r\n" + 
		"            \"nombre\": \"Alejandro\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Castro Vicente\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"17/07/1984\",\r\n" + 
		"            \"id\": 3,\r\n" + 
		"            \"nombre\": \"Eric\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Vázquez Alonso\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"09/04/1984\",\r\n" + 
		"            \"id\": 4,\r\n" + 
		"            \"nombre\": \"Laura\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Blanco Gallego\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"21/04/1984\",\r\n" + 
		"            \"id\": 5,\r\n" + 
		"            \"nombre\": \"Sofía\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Álvarez Pastor\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"24/02/2000\",\r\n" + 
		"            \"id\": 6,\r\n" + 
		"            \"nombre\": \"Sergio\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Moreno Hernández\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"16/12/1990\",\r\n" + 
		"            \"id\": 7,\r\n" + 
		"            \"nombre\": \"Laia\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Guerrero Jiménez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"29/11/1986\",\r\n" + 
		"            \"id\": 8,\r\n" + 
		"            \"nombre\": \"Aaron\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Castro Márquez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"12/10/1999\",\r\n" + 
		"            \"id\": 9,\r\n" + 
		"            \"nombre\": \"Carlos\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Suárez Herrera\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"24/08/1985\",\r\n" + 
		"            \"id\": 10,\r\n" + 
		"            \"nombre\": \"Marc\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Vicente Torres\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"10/09/1992\",\r\n" + 
		"            \"id\": 11,\r\n" + 
		"            \"nombre\": \"Clara\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Torres Gutiérrez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"24/09/1998\",\r\n" + 
		"            \"id\": 12,\r\n" + 
		"            \"nombre\": \"Carmen\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Rodríguez Sánchez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"06/02/1983\",\r\n" + 
		"            \"id\": 13,\r\n" + 
		"            \"nombre\": \"Daniela\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Martín Carrasco\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"07/04/1991\",\r\n" + 
		"            \"id\": 14,\r\n" + 
		"            \"nombre\": \"Alberto\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Herrero García\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"01/03/1980\",\r\n" + 
		"            \"id\": 15,\r\n" + 
		"            \"nombre\": \"Aaron\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"González Prieto\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"29/09/1995\",\r\n" + 
		"            \"id\": 16,\r\n" + 
		"            \"nombre\": \"Gabriel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ortega Román\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"08/09/1981\",\r\n" + 
		"            \"id\": 17,\r\n" + 
		"            \"nombre\": \"Blanca\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ortega Pérez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"03/09/1986\",\r\n" + 
		"            \"id\": 18,\r\n" + 
		"            \"nombre\": \"Jesús\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Fuentes Aguilar\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"15/10/1985\",\r\n" + 
		"            \"id\": 19,\r\n" + 
		"            \"nombre\": \"Héctor\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Castro Sánchez\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"05/04/1995\",\r\n" + 
		"            \"id\": 20,\r\n" + 
		"            \"nombre\": \"Claudia\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Caballero Sanz\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"31/03/1980\",\r\n" + 
		"            \"id\": 21,\r\n" + 
		"            \"nombre\": \"Candela\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Marín Aguilar\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"05/10/1990\",\r\n" + 
		"            \"id\": 22,\r\n" + 
		"            \"nombre\": \"Alex\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Molina Fernández\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"18/01/1999\",\r\n" + 
		"            \"id\": 23,\r\n" + 
		"            \"nombre\": \"Rubén\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Román Nieto\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"09/08/1992\",\r\n" + 
		"            \"id\": 24,\r\n" + 
		"            \"nombre\": \"Mateo\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Parra Sáez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"02/01/1989\",\r\n" + 
		"            \"id\": 25,\r\n" + 
		"            \"nombre\": \"Elsa\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Lozano Cruz\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/04/1986\",\r\n" + 
		"            \"id\": 26,\r\n" + 
		"            \"nombre\": \"Nora\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Sánchez Domínguez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"21/01/1995\",\r\n" + 
		"            \"id\": 27,\r\n" + 
		"            \"nombre\": \"Nicolás\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Pastor Medina\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"11/01/1986\",\r\n" + 
		"            \"id\": 28,\r\n" + 
		"            \"nombre\": \"Mario\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Martín Soler\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"12/01/1989\",\r\n" + 
		"            \"id\": 29,\r\n" + 
		"            \"nombre\": \"Alex\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Díaz Delgado\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"10/07/1998\",\r\n" + 
		"            \"id\": 30,\r\n" + 
		"            \"nombre\": \"Vera\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Peña Caballero\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"06/12/1982\",\r\n" + 
		"            \"id\": 31,\r\n" + 
		"            \"nombre\": \"Alicia\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Vázquez Calvo\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"16/03/1999\",\r\n" + 
		"            \"id\": 32,\r\n" + 
		"            \"nombre\": \"Noa\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ferrer Vidal\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"18/05/1987\",\r\n" + 
		"            \"id\": 33,\r\n" + 
		"            \"nombre\": \"Elena\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Calvo Moya\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"11/07/1988\",\r\n" + 
		"            \"id\": 34,\r\n" + 
		"            \"nombre\": \"Blanca\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"González López\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"27/02/1995\",\r\n" + 
		"            \"id\": 35,\r\n" + 
		"            \"nombre\": \"Emma\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Bravo Velasco\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"23/12/1988\",\r\n" + 
		"            \"id\": 36,\r\n" + 
		"            \"nombre\": \"Carmen\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Crespo Iglesias\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"26/06/1999\",\r\n" + 
		"            \"id\": 37,\r\n" + 
		"            \"nombre\": \"Martín\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Pascual Martínez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"31/01/1994\",\r\n" + 
		"            \"id\": 38,\r\n" + 
		"            \"nombre\": \"Marta\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Mora Nieto\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"27/05/1983\",\r\n" + 
		"            \"id\": 39,\r\n" + 
		"            \"nombre\": \"Sergio\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ramos Román\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"19/12/2000\",\r\n" + 
		"            \"id\": 40,\r\n" + 
		"            \"nombre\": \"Emma\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Fuentes Fuentes\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"27/06/1990\",\r\n" + 
		"            \"id\": 41,\r\n" + 
		"            \"nombre\": \"Blanca\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"López Caballero\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"21/09/1989\",\r\n" + 
		"            \"id\": 42,\r\n" + 
		"            \"nombre\": \"Gonzalo\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Castillo Ruíz\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"01/02/1996\",\r\n" + 
		"            \"id\": 43,\r\n" + 
		"            \"nombre\": \"Triana\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Hernández Lorenzo\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"05/05/1996\",\r\n" + 
		"            \"id\": 44,\r\n" + 
		"            \"nombre\": \"Miguel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Sánchez Durán\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"20/10/1997\",\r\n" + 
		"            \"id\": 45,\r\n" + 
		"            \"nombre\": \"Marco\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ruíz Ramírez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"22/01/1999\",\r\n" + 
		"            \"id\": 46,\r\n" + 
		"            \"nombre\": \"Manuel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ramos Iglesias\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"04/06/1982\",\r\n" + 
		"            \"id\": 47,\r\n" + 
		"            \"nombre\": \"Iker\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Fuentes Santos\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"08/10/1989\",\r\n" + 
		"            \"id\": 48,\r\n" + 
		"            \"nombre\": \"Carla\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Fernández Fuentes\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"10/08/1985\",\r\n" + 
		"            \"id\": 49,\r\n" + 
		"            \"nombre\": \"Aitor\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Castro Ramos\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"26/03/1997\",\r\n" + 
		"            \"id\": 50,\r\n" + 
		"            \"nombre\": \"Antonio\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"López Serrano\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"17/07/1981\",\r\n" + 
		"            \"id\": 51,\r\n" + 
		"            \"nombre\": \"Rocío\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Iglesias Aguilar\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"06/09/1995\",\r\n" + 
		"            \"id\": 52,\r\n" + 
		"            \"nombre\": \"Alberto\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ortiz Vidal\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"02/10/1987\",\r\n" + 
		"            \"id\": 53,\r\n" + 
		"            \"nombre\": \"Sofía\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Arias Esteban\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"30/11/1997\",\r\n" + 
		"            \"id\": 54,\r\n" + 
		"            \"nombre\": \"Vera\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Méndez Vega\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"10/09/2000\",\r\n" + 
		"            \"id\": 55,\r\n" + 
		"            \"nombre\": \"Jesús\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Sánchez Díaz\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"12/04/1999\",\r\n" + 
		"            \"id\": 56,\r\n" + 
		"            \"nombre\": \"Jimena\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Santiago Ramírez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"02/10/1999\",\r\n" + 
		"            \"id\": 57,\r\n" + 
		"            \"nombre\": \"Elsa\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Rubio Soto\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"14/04/1983\",\r\n" + 
		"            \"id\": 58,\r\n" + 
		"            \"nombre\": \"Miguel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Román Medina\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"26/08/1981\",\r\n" + 
		"            \"id\": 59,\r\n" + 
		"            \"nombre\": \"Alba\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Rodríguez Delgado\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"25/06/1998\",\r\n" + 
		"            \"id\": 60,\r\n" + 
		"            \"nombre\": \"Irene\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Gallardo Carmona\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"02/09/1998\",\r\n" + 
		"            \"id\": 61,\r\n" + 
		"            \"nombre\": \"Darío\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Delgado Cano\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"07/07/1988\",\r\n" + 
		"            \"id\": 62,\r\n" + 
		"            \"nombre\": \"Darío\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Iglesias Casado\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"26/09/1992\",\r\n" + 
		"            \"id\": 63,\r\n" + 
		"            \"nombre\": \"Vera\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"González Sánchez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"13/09/1985\",\r\n" + 
		"            \"id\": 64,\r\n" + 
		"            \"nombre\": \"Martina\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Durán Castillo\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"06/10/1999\",\r\n" + 
		"            \"id\": 65,\r\n" + 
		"            \"nombre\": \"Ángel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Morales Jiménez\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/09/1985\",\r\n" + 
		"            \"id\": 66,\r\n" + 
		"            \"nombre\": \"Ariadna\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Pascual Guerrero\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"12/02/1985\",\r\n" + 
		"            \"id\": 67,\r\n" + 
		"            \"nombre\": \"Víctor\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"García Martín\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"22/10/1994\",\r\n" + 
		"            \"id\": 68,\r\n" + 
		"            \"nombre\": \"Aitana\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Cortes Gutiérrez\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"04/01/1986\",\r\n" + 
		"            \"id\": 69,\r\n" + 
		"            \"nombre\": \"Antonio\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Gómez Benítez\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"21/02/1998\",\r\n" + 
		"            \"id\": 70,\r\n" + 
		"            \"nombre\": \"Nora\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ortiz Méndez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"16/06/1992\",\r\n" + 
		"            \"id\": 71,\r\n" + 
		"            \"nombre\": \"Manuel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Velasco Vargas\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"01/12/1999\",\r\n" + 
		"            \"id\": 72,\r\n" + 
		"            \"nombre\": \"Alba\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Mora Flores\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"04/11/1996\",\r\n" + 
		"            \"id\": 73,\r\n" + 
		"            \"nombre\": \"Carmen\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Herrero Reyes\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"24/11/1983\",\r\n" + 
		"            \"id\": 74,\r\n" + 
		"            \"nombre\": \"Álvaro\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Domínguez Bravo\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"02/03/1989\",\r\n" + 
		"            \"id\": 75,\r\n" + 
		"            \"nombre\": \"Hugo\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Muñoz Navarro\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"30/06/1988\",\r\n" + 
		"            \"id\": 76,\r\n" + 
		"            \"nombre\": \"María\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Sanz Campos\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"27/07/1997\",\r\n" + 
		"            \"id\": 77,\r\n" + 
		"            \"nombre\": \"Carmen\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Prieto Pascual\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"26/11/1989\",\r\n" + 
		"            \"id\": 78,\r\n" + 
		"            \"nombre\": \"Marina\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Guerrero Hernández\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"13/02/1991\",\r\n" + 
		"            \"id\": 79,\r\n" + 
		"            \"nombre\": \"Darío\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Casado Prieto\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"14/04/1989\",\r\n" + 
		"            \"id\": 80,\r\n" + 
		"            \"nombre\": \"Elena\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Soto Sánchez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"08/05/1996\",\r\n" + 
		"            \"id\": 81,\r\n" + 
		"            \"nombre\": \"Carla\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Díez Bravo\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"25/10/1980\",\r\n" + 
		"            \"id\": 82,\r\n" + 
		"            \"nombre\": \"Jesús\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Cruz Ramírez\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"06/11/1986\",\r\n" + 
		"            \"id\": 83,\r\n" + 
		"            \"nombre\": \"Gabriel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Romero Martín\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/11/1999\",\r\n" + 
		"            \"id\": 84,\r\n" + 
		"            \"nombre\": \"Carmen\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Montero Prieto\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/10/1996\",\r\n" + 
		"            \"id\": 85,\r\n" + 
		"            \"nombre\": \"Sara\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Reyes Pérez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"03/10/1988\",\r\n" + 
		"            \"id\": 86,\r\n" + 
		"            \"nombre\": \"Vera\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Sánchez Sáez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"12/12/2000\",\r\n" + 
		"            \"id\": 87,\r\n" + 
		"            \"nombre\": \"Clara\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Reyes Delgado\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/07/2000\",\r\n" + 
		"            \"id\": 88,\r\n" + 
		"            \"nombre\": \"Emma\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Calvo Calvo\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"30/10/1984\",\r\n" + 
		"            \"id\": 89,\r\n" + 
		"            \"nombre\": \"Leire\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Vicente Suárez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"20/02/1994\",\r\n" + 
		"            \"id\": 90,\r\n" + 
		"            \"nombre\": \"Ana\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Suárez Ruíz\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"05/08/1990\",\r\n" + 
		"            \"id\": 91,\r\n" + 
		"            \"nombre\": \"Gonzalo\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Fernández Blanco\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"07/04/1991\",\r\n" + 
		"            \"id\": 92,\r\n" + 
		"            \"nombre\": \"Jorge\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"García Hidalgo\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"09/01/2000\",\r\n" + 
		"            \"id\": 93,\r\n" + 
		"            \"nombre\": \"Gabriel\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Soto Pérez\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/07/1984\",\r\n" + 
		"            \"id\": 94,\r\n" + 
		"            \"nombre\": \"Alex\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Moya Gallardo\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"24/11/1985\",\r\n" + 
		"            \"id\": 95,\r\n" + 
		"            \"nombre\": \"Sergio\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Velasco Herrera\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"29/10/1985\",\r\n" + 
		"            \"id\": 96,\r\n" + 
		"            \"nombre\": \"Ana\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Herrero Domínguez\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"19/08/1983\",\r\n" + 
		"            \"id\": 97,\r\n" + 
		"            \"nombre\": \"Ainara\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Gallardo Esteban\",\r\n" + 
		"            \"grupo\": \"ASIR\",\r\n" + 
		"            \"fecha_nacimiento\": \"28/04/1998\",\r\n" + 
		"            \"id\": 98,\r\n" + 
		"            \"nombre\": \"Ariadna\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Sánchez Román\",\r\n" + 
		"            \"grupo\": \"SMR\",\r\n" + 
		"            \"fecha_nacimiento\": \"30/01/1986\",\r\n" + 
		"            \"id\": 99,\r\n" + 
		"            \"nombre\": \"Marc\"\r\n" + 
		"      },\r\n" + 
		"      {\r\n" + 
		"            \"apellidos\": \"Ferrer Alonso\",\r\n" + 
		"            \"grupo\": \"DAM\",\r\n" + 
		"            \"fecha_nacimiento\": \"09/01/1990\",\r\n" + 
		"            \"id\": 100,\r\n" + 
		"            \"nombre\": \"Guillermo\"\r\n" + 
		"      }\r\n" + 
		"]}}";
JSONObject obj = new JSONObject(json);
String xml=XML.toString(obj);
System.out.println(xml);
FileWriter fw=new FileWriter("salida\\jsontoxmlalumnos.xml");
PrintWriter pw=new PrintWriter(fw);
pw.write(xml);
pw.close();
	}

}
