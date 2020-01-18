package ejercicio1;
import repasodatos.alumno;
import repasodatos.grupo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class alumnoxml {
	private static List<String>listanombres;
	private static List<String>listaapellidos;
	private static long FechaInicio;
	private static long FechaFin;
	private static long rangoFechas;
	public static void main(String[] args) throws IOException {
		cargarlistas();		
		calcularfechas();
		generarxml();
	}
	private static void cargarlistas() throws IOException {
		//creo el fichero de nombres que su ruta esta en la url
		File ficheroNombres = new File("entrada\\nombres.txt");
		listanombres = obtenerListaDesdeFichero(ficheroNombres);
		//creo el fichero de apellidos
		File ficheroapellidos = new File("entrada\\apellidos.txt");
		listaapellidos = obtenerListaDesdeFichero(ficheroapellidos);
	}
	private static List<String> obtenerListaDesdeFichero(File ficheroEntrada) throws IOException/*este se refiere a los ficheros creados antes*/{
		List<String> lista = new ArrayList<String>();//creo una lista que sera donde se guarden los nombres y apellidos
		try {
			FileReader fr=new FileReader(ficheroEntrada);//declaro filereader para leer el fichero de entrada(nombres y apellidos);
			int f;
			String cadena="";
			while((f=fr.read())!=-1) {
				if (f == ',' || f == '.')/*si es . o , lo toma como null*/ {
					lista.add(cadena);
					cadena="";
				}else if(f!= ' ') {
					cadena +=(char)f;
				}
			}

		} catch (FileNotFoundException e) {

			System.out.println("ERROR al abrir el fichero: " + ficheroEntrada.getPath());
		} catch (IOException e) {

			System.out.println("ERROR al leer el fichero: " + ficheroEntrada.getPath());
		}

		return lista;

	}
	private static long numeroaleatorio(long size) {
		return (long)(Math.random()*(size));

	}
	private static void calcularfechas() {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");//creo un objeto de la funcion
			FechaInicio=simpleDateFormat.parse("01/01/1980").getTime();
			FechaFin=simpleDateFormat.parse("31/12/2000").getTime();
		}catch (ParseException e) {

			System.out.println("ERROR al parsear una fecha");
		}
		rangoFechas = FechaFin - FechaInicio + 1;
	}
	private static String generarfecha() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		long timestampAleatorio = numeroaleatorio(rangoFechas) + FechaInicio;//aprovecho el metodo de generar numero aleatorio y le pongo el inicio y el limite

		Date fechaAleatoria = new Date(timestampAleatorio);
		return simpleDateFormat.format(fechaAleatoria);
	}
	private static String generarAlumno(int id) {

		alumno alumno = new alumno(
				id,
				listanombres.get((int) numeroaleatorio(listanombres.size())),
				listaapellidos.get((int) numeroaleatorio(listaapellidos.size()))
				+ " " + listaapellidos.get((int) numeroaleatorio(listaapellidos.size())),
				grupo.values()[(int) numeroaleatorio(grupo.values().length)],
				generarfecha()
				);

		return  alumno.toXml();
	}
	private static void generarxml() {
		new File("salida").mkdir();
		File ficheroSalida = new File("salida\\alumnos.xml");

		String cabeceraXml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>";
		String alumnosEtiquetaApertura = "<alumnos>";
		String alumnosEtiquetaCierre = "</alumnos>";
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter(ficheroSalida));
			bw.write(cabeceraXml + "\r\n");
			bw.write(alumnosEtiquetaApertura + "\r\n");
			for(int f=1;f<=100;f++) {
				bw.write(generarAlumno(f) + "\r\n" );
			}
			bw.write(alumnosEtiquetaCierre);
			bw.close();

		}catch (IOException e) {

			System.out.println("ERROR al escribir en el fichero alumnos.xml");

		}


	}
}
