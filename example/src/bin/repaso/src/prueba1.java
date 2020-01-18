import java.io.*;
import java.util.*;

public class prueba1 {
	static List<String>Nombres;
	static List<String>Apellidos;

	public static void main(String[] args) {
		
	}
	public static void cargarlistas() {
		File nombres=new File("saldia\\nombres.txt");
		Nombres=cargarlista(nombres);
		File apellidos=new File("saldia\\apellidos.txt");
		Apellidos=cargarlista(nombres);
	}
	public static List<String> cargarlista(File fichero) {
		List<String> lista = new ArrayList<String>();
		
		
		
		return lista;
		
	}

}
