package XmltoJson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import jdk.jfr.events.FileWriteEvent;
import jdk.nashorn.api.scripting.JSObject;

public class xmltojson {
	public static void main(String...args) throws JSONException, IOException {
		String xml="<alumnos>\r\n" + 
				"	<alumno id=\"1\">\r\n" + 
				"		<nombre>Hugo</nombre>\r\n" + 
				"		<apellidos>Gómez Pascual</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>03/10/1980</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"2\">\r\n" + 
				"		<nombre>Alejandro</nombre>\r\n" + 
				"		<apellidos>González Vázquez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>05/04/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"3\">\r\n" + 
				"		<nombre>Eric</nombre>\r\n" + 
				"		<apellidos>Castro Vicente</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>17/07/1984</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"4\">\r\n" + 
				"		<nombre>Laura</nombre>\r\n" + 
				"		<apellidos>Vázquez Alonso</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>09/04/1984</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"5\">\r\n" + 
				"		<nombre>Sofía</nombre>\r\n" + 
				"		<apellidos>Blanco Gallego</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>21/04/1984</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"6\">\r\n" + 
				"		<nombre>Sergio</nombre>\r\n" + 
				"		<apellidos>Álvarez Pastor</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>24/02/2000</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"7\">\r\n" + 
				"		<nombre>Laia</nombre>\r\n" + 
				"		<apellidos>Moreno Hernández</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>16/12/1990</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"8\">\r\n" + 
				"		<nombre>Aaron</nombre>\r\n" + 
				"		<apellidos>Guerrero Jiménez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>29/11/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"9\">\r\n" + 
				"		<nombre>Carlos</nombre>\r\n" + 
				"		<apellidos>Castro Márquez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>12/10/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"10\">\r\n" + 
				"		<nombre>Marc</nombre>\r\n" + 
				"		<apellidos>Suárez Herrera</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>24/08/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"11\">\r\n" + 
				"		<nombre>Clara</nombre>\r\n" + 
				"		<apellidos>Vicente Torres</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>10/09/1992</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"12\">\r\n" + 
				"		<nombre>Carmen</nombre>\r\n" + 
				"		<apellidos>Torres Gutiérrez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>24/09/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"13\">\r\n" + 
				"		<nombre>Daniela</nombre>\r\n" + 
				"		<apellidos>Rodríguez Sánchez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>06/02/1983</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"14\">\r\n" + 
				"		<nombre>Alberto</nombre>\r\n" + 
				"		<apellidos>Martín Carrasco</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>07/04/1991</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"15\">\r\n" + 
				"		<nombre>Aaron</nombre>\r\n" + 
				"		<apellidos>Herrero García</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>01/03/1980</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"16\">\r\n" + 
				"		<nombre>Gabriel</nombre>\r\n" + 
				"		<apellidos>González Prieto</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>29/09/1995</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"17\">\r\n" + 
				"		<nombre>Blanca</nombre>\r\n" + 
				"		<apellidos>Ortega Román</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>08/09/1981</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"18\">\r\n" + 
				"		<nombre>Jesús</nombre>\r\n" + 
				"		<apellidos>Ortega Pérez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>03/09/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"19\">\r\n" + 
				"		<nombre>Héctor</nombre>\r\n" + 
				"		<apellidos>Fuentes Aguilar</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>15/10/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"20\">\r\n" + 
				"		<nombre>Claudia</nombre>\r\n" + 
				"		<apellidos>Castro Sánchez</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>05/04/1995</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"21\">\r\n" + 
				"		<nombre>Candela</nombre>\r\n" + 
				"		<apellidos>Caballero Sanz</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>31/03/1980</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"22\">\r\n" + 
				"		<nombre>Alex</nombre>\r\n" + 
				"		<apellidos>Marín Aguilar</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>05/10/1990</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"23\">\r\n" + 
				"		<nombre>Rubén</nombre>\r\n" + 
				"		<apellidos>Molina Fernández</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>18/01/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"24\">\r\n" + 
				"		<nombre>Mateo</nombre>\r\n" + 
				"		<apellidos>Román Nieto</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>09/08/1992</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"25\">\r\n" + 
				"		<nombre>Elsa</nombre>\r\n" + 
				"		<apellidos>Parra Sáez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>02/01/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"26\">\r\n" + 
				"		<nombre>Nora</nombre>\r\n" + 
				"		<apellidos>Lozano Cruz</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>28/04/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"27\">\r\n" + 
				"		<nombre>Nicolás</nombre>\r\n" + 
				"		<apellidos>Sánchez Domínguez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>21/01/1995</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"28\">\r\n" + 
				"		<nombre>Mario</nombre>\r\n" + 
				"		<apellidos>Pastor Medina</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>11/01/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"29\">\r\n" + 
				"		<nombre>Alex</nombre>\r\n" + 
				"		<apellidos>Martín Soler</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>12/01/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"30\">\r\n" + 
				"		<nombre>Vera</nombre>\r\n" + 
				"		<apellidos>Díaz Delgado</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>10/07/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"31\">\r\n" + 
				"		<nombre>Alicia</nombre>\r\n" + 
				"		<apellidos>Peña Caballero</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>06/12/1982</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"32\">\r\n" + 
				"		<nombre>Noa</nombre>\r\n" + 
				"		<apellidos>Vázquez Calvo</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>16/03/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"33\">\r\n" + 
				"		<nombre>Elena</nombre>\r\n" + 
				"		<apellidos>Ferrer Vidal</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>18/05/1987</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"34\">\r\n" + 
				"		<nombre>Blanca</nombre>\r\n" + 
				"		<apellidos>Calvo Moya</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>11/07/1988</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"35\">\r\n" + 
				"		<nombre>Emma</nombre>\r\n" + 
				"		<apellidos>González López</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>27/02/1995</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"36\">\r\n" + 
				"		<nombre>Carmen</nombre>\r\n" + 
				"		<apellidos>Bravo Velasco</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>23/12/1988</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"37\">\r\n" + 
				"		<nombre>Martín</nombre>\r\n" + 
				"		<apellidos>Crespo Iglesias</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>26/06/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"38\">\r\n" + 
				"		<nombre>Marta</nombre>\r\n" + 
				"		<apellidos>Pascual Martínez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>31/01/1994</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"39\">\r\n" + 
				"		<nombre>Sergio</nombre>\r\n" + 
				"		<apellidos>Mora Nieto</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>27/05/1983</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"40\">\r\n" + 
				"		<nombre>Emma</nombre>\r\n" + 
				"		<apellidos>Ramos Román</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>19/12/2000</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"41\">\r\n" + 
				"		<nombre>Blanca</nombre>\r\n" + 
				"		<apellidos>Fuentes Fuentes</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>27/06/1990</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"42\">\r\n" + 
				"		<nombre>Gonzalo</nombre>\r\n" + 
				"		<apellidos>López Caballero</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>21/09/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"43\">\r\n" + 
				"		<nombre>Triana</nombre>\r\n" + 
				"		<apellidos>Castillo Ruíz</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>01/02/1996</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"44\">\r\n" + 
				"		<nombre>Miguel</nombre>\r\n" + 
				"		<apellidos>Hernández Lorenzo</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>05/05/1996</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"45\">\r\n" + 
				"		<nombre>Marco</nombre>\r\n" + 
				"		<apellidos>Sánchez Durán</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>20/10/1997</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"46\">\r\n" + 
				"		<nombre>Manuel</nombre>\r\n" + 
				"		<apellidos>Ruíz Ramírez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>22/01/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"47\">\r\n" + 
				"		<nombre>Iker</nombre>\r\n" + 
				"		<apellidos>Ramos Iglesias</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>04/06/1982</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"48\">\r\n" + 
				"		<nombre>Carla</nombre>\r\n" + 
				"		<apellidos>Fuentes Santos</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>08/10/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"49\">\r\n" + 
				"		<nombre>Aitor</nombre>\r\n" + 
				"		<apellidos>Fernández Fuentes</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>10/08/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"50\">\r\n" + 
				"		<nombre>Antonio</nombre>\r\n" + 
				"		<apellidos>Castro Ramos</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>26/03/1997</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"51\">\r\n" + 
				"		<nombre>Rocío</nombre>\r\n" + 
				"		<apellidos>López Serrano</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>17/07/1981</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"52\">\r\n" + 
				"		<nombre>Alberto</nombre>\r\n" + 
				"		<apellidos>Iglesias Aguilar</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>06/09/1995</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"53\">\r\n" + 
				"		<nombre>Sofía</nombre>\r\n" + 
				"		<apellidos>Ortiz Vidal</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>02/10/1987</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"54\">\r\n" + 
				"		<nombre>Vera</nombre>\r\n" + 
				"		<apellidos>Arias Esteban</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>30/11/1997</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"55\">\r\n" + 
				"		<nombre>Jesús</nombre>\r\n" + 
				"		<apellidos>Méndez Vega</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>10/09/2000</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"56\">\r\n" + 
				"		<nombre>Jimena</nombre>\r\n" + 
				"		<apellidos>Sánchez Díaz</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>12/04/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"57\">\r\n" + 
				"		<nombre>Elsa</nombre>\r\n" + 
				"		<apellidos>Santiago Ramírez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>02/10/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"58\">\r\n" + 
				"		<nombre>Miguel</nombre>\r\n" + 
				"		<apellidos>Rubio Soto</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>14/04/1983</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"59\">\r\n" + 
				"		<nombre>Alba</nombre>\r\n" + 
				"		<apellidos>Román Medina</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>26/08/1981</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"60\">\r\n" + 
				"		<nombre>Irene</nombre>\r\n" + 
				"		<apellidos>Rodríguez Delgado</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>25/06/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"61\">\r\n" + 
				"		<nombre>Darío</nombre>\r\n" + 
				"		<apellidos>Gallardo Carmona</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>02/09/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"62\">\r\n" + 
				"		<nombre>Darío</nombre>\r\n" + 
				"		<apellidos>Delgado Cano</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>07/07/1988</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"63\">\r\n" + 
				"		<nombre>Vera</nombre>\r\n" + 
				"		<apellidos>Iglesias Casado</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>26/09/1992</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"64\">\r\n" + 
				"		<nombre>Martina</nombre>\r\n" + 
				"		<apellidos>González Sánchez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>13/09/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"65\">\r\n" + 
				"		<nombre>Ángel</nombre>\r\n" + 
				"		<apellidos>Durán Castillo</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>06/10/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"66\">\r\n" + 
				"		<nombre>Ariadna</nombre>\r\n" + 
				"		<apellidos>Morales Jiménez</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>28/09/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"67\">\r\n" + 
				"		<nombre>Víctor</nombre>\r\n" + 
				"		<apellidos>Pascual Guerrero</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>12/02/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"68\">\r\n" + 
				"		<nombre>Aitana</nombre>\r\n" + 
				"		<apellidos>García Martín</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>22/10/1994</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"69\">\r\n" + 
				"		<nombre>Antonio</nombre>\r\n" + 
				"		<apellidos>Cortes Gutiérrez</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>04/01/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"70\">\r\n" + 
				"		<nombre>Nora</nombre>\r\n" + 
				"		<apellidos>Gómez Benítez</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>21/02/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"71\">\r\n" + 
				"		<nombre>Manuel</nombre>\r\n" + 
				"		<apellidos>Ortiz Méndez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>16/06/1992</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"72\">\r\n" + 
				"		<nombre>Alba</nombre>\r\n" + 
				"		<apellidos>Velasco Vargas</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>01/12/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"73\">\r\n" + 
				"		<nombre>Carmen</nombre>\r\n" + 
				"		<apellidos>Mora Flores</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>04/11/1996</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"74\">\r\n" + 
				"		<nombre>Álvaro</nombre>\r\n" + 
				"		<apellidos>Herrero Reyes</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>24/11/1983</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"75\">\r\n" + 
				"		<nombre>Hugo</nombre>\r\n" + 
				"		<apellidos>Domínguez Bravo</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>02/03/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"76\">\r\n" + 
				"		<nombre>María</nombre>\r\n" + 
				"		<apellidos>Muñoz Navarro</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>30/06/1988</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"77\">\r\n" + 
				"		<nombre>Carmen</nombre>\r\n" + 
				"		<apellidos>Sanz Campos</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>27/07/1997</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"78\">\r\n" + 
				"		<nombre>Marina</nombre>\r\n" + 
				"		<apellidos>Prieto Pascual</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>26/11/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"79\">\r\n" + 
				"		<nombre>Darío</nombre>\r\n" + 
				"		<apellidos>Guerrero Hernández</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>13/02/1991</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"80\">\r\n" + 
				"		<nombre>Elena</nombre>\r\n" + 
				"		<apellidos>Casado Prieto</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>14/04/1989</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"81\">\r\n" + 
				"		<nombre>Carla</nombre>\r\n" + 
				"		<apellidos>Soto Sánchez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>08/05/1996</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"82\">\r\n" + 
				"		<nombre>Jesús</nombre>\r\n" + 
				"		<apellidos>Díez Bravo</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>25/10/1980</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"83\">\r\n" + 
				"		<nombre>Gabriel</nombre>\r\n" + 
				"		<apellidos>Cruz Ramírez</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>06/11/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"84\">\r\n" + 
				"		<nombre>Carmen</nombre>\r\n" + 
				"		<apellidos>Romero Martín</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>28/11/1999</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"85\">\r\n" + 
				"		<nombre>Sara</nombre>\r\n" + 
				"		<apellidos>Montero Prieto</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>28/10/1996</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"86\">\r\n" + 
				"		<nombre>Vera</nombre>\r\n" + 
				"		<apellidos>Reyes Pérez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>03/10/1988</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"87\">\r\n" + 
				"		<nombre>Clara</nombre>\r\n" + 
				"		<apellidos>Sánchez Sáez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>12/12/2000</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"88\">\r\n" + 
				"		<nombre>Emma</nombre>\r\n" + 
				"		<apellidos>Reyes Delgado</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>28/07/2000</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"89\">\r\n" + 
				"		<nombre>Leire</nombre>\r\n" + 
				"		<apellidos>Calvo Calvo</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>30/10/1984</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"90\">\r\n" + 
				"		<nombre>Ana</nombre>\r\n" + 
				"		<apellidos>Vicente Suárez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>20/02/1994</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"91\">\r\n" + 
				"		<nombre>Gonzalo</nombre>\r\n" + 
				"		<apellidos>Suárez Ruíz</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>05/08/1990</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"92\">\r\n" + 
				"		<nombre>Jorge</nombre>\r\n" + 
				"		<apellidos>Fernández Blanco</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>07/04/1991</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"93\">\r\n" + 
				"		<nombre>Gabriel</nombre>\r\n" + 
				"		<apellidos>García Hidalgo</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>09/01/2000</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"94\">\r\n" + 
				"		<nombre>Alex</nombre>\r\n" + 
				"		<apellidos>Soto Pérez</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>28/07/1984</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"95\">\r\n" + 
				"		<nombre>Sergio</nombre>\r\n" + 
				"		<apellidos>Moya Gallardo</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>24/11/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"96\">\r\n" + 
				"		<nombre>Ana</nombre>\r\n" + 
				"		<apellidos>Velasco Herrera</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>29/10/1985</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"97\">\r\n" + 
				"		<nombre>Ainara</nombre>\r\n" + 
				"		<apellidos>Herrero Domínguez</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>19/08/1983</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"98\">\r\n" + 
				"		<nombre>Ariadna</nombre>\r\n" + 
				"		<apellidos>Gallardo Esteban</apellidos>\r\n" + 
				"		<grupo>ASIR</grupo>\r\n" + 
				"		<fecha_nacimiento>28/04/1998</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"99\">\r\n" + 
				"		<nombre>Marc</nombre>\r\n" + 
				"		<apellidos>Sánchez Román</apellidos>\r\n" + 
				"		<grupo>SMR</grupo>\r\n" + 
				"		<fecha_nacimiento>30/01/1986</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"	<alumno id=\"100\">\r\n" + 
				"		<nombre>Guillermo</nombre>\r\n" + 
				"		<apellidos>Ferrer Alonso</apellidos>\r\n" + 
				"		<grupo>DAM</grupo>\r\n" + 
				"		<fecha_nacimiento>09/01/1990</fecha_nacimiento>\r\n" + 
				"	</alumno>\r\n" + 
				"\r\n" + 
				"</alumnos>";;
				JSONObject jsonObject=XML.toJSONObject(xml);
				String jsonPrettyPrintString=jsonObject.toString(6);
				System.out.println(jsonPrettyPrintString);
				FileWriter fw=new FileWriter("E:\\repaso\\salida\\jsonalumnos.txt");
				PrintWriter pw=new PrintWriter(fw);
				pw.write(jsonPrettyPrintString);
				pw.close();
	}

}
