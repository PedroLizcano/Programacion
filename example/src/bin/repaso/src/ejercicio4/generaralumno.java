package ejercicio4;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import repasodatos.alumno;
import repasodatos.grupo;

public class generaralumno {
	static List<String>apellidos=new ArrayList<String>();
	static List<String>nombres=new ArrayList<String>();
	static long FechaInicio;
	static long FechaFin;
	static long fechaintervalo;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		cargarnombres();
		cargarapellidos();
		generarxml();
	}
	public static void cargarnombres() throws IOException {

		File fichero=new File("entrada\\nombres.txt");
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		int f;
		String cadena="";
		while((f=br.read())!=-1) {
			if(f==','||f=='.') {
				nombres.add(cadena);
				cadena="";
			}else if(f==' '){
				cadena+=(char)f;
			}


		}

	}
	public static void cargarapellidos() throws IOException {

		File fichero=new File("entrada\\nombres.txt");
		FileReader fr=new FileReader(fichero);
		BufferedReader br=new BufferedReader(fr);
		int f;
		String cadena="";
		while((f=br.read())!=-1) {
			if(f==','||f=='.') {
				apellidos.add(cadena);
				cadena="";
			}else if(f==' '){
				cadena+=(char)f;
			}


		}

	}
	public static void generarfecha() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");//creo un objeto de la funcion
		FechaInicio = simpleDateFormat.parse("01/01/1980").getTime();
		FechaFin = simpleDateFormat.parse("31/12/2000").getTime();
		fechaintervalo=FechaFin-FechaInicio+1;
	}
	private static String generarfechas() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		long timestampAleatorio = numeroaleatorio(fechaintervalo) + FechaInicio;//aprovecho el metodo de generar numero aleatorio y le pongo el inicio y el limite

		Date fechaAleatoria = new Date(timestampAleatorio);
		return simpleDateFormat.format(fechaAleatoria);
	}
	private static long numeroaleatorio(long size) {
		return (long)(Math.random()*(size));

	}
	public static String generaralumno(int id) {
		alumno clase = new alumno(
				id,
				nombres.get((int) numeroaleatorio(nombres.size())),
				apellidos.get((int) numeroaleatorio(apellidos.size()))
				+ " " + apellidos.get((int) numeroaleatorio(apellidos.size())),
				grupo.values()[(int) numeroaleatorio(grupo.values().length)],
				generarfechas()
				);
return clase.toXml();
	}
	private static void generarxml() {
		new File("salida").mkdir();
		File ficheroSalida = new File("salida\\alumnos1.xml");

		String cabeceraXml = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>";

		String alumnosEtiquetaApertura = "<alumnos>";
		String alumnosEtiquetaCierre = "</alumnos>";
		try {
			BufferedWriter bw= new BufferedWriter(new FileWriter(ficheroSalida));
			bw.write(cabeceraXml + "\r\n");
			bw.write(alumnosEtiquetaApertura + "\r\n");
			for(int f=1;f<=100;f++) {
				bw.write(generaralumno(f) + "\r\n" );
			}
			bw.write(alumnosEtiquetaCierre);
			bw.close();

		}catch (IOException e) {

			System.out.println("ERROR al escribir en el fichero alumnos.xml");

		}


	}

}
