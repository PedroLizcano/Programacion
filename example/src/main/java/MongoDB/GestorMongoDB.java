package MongoDB;

import java.util.Iterator;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.MongoSocketOpenException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class GestorMongoDB {
	private static MongoClient mongo;
	private static MongoDatabase database;
	static Scanner teclado=new Scanner(System.in);
	public static void main(String args[]){
		menu();
	}
	static int insertInt() {
		try {
			int integer = teclado.nextInt();
			return integer;

		}catch(Exception e) {
			System.out.println("Valor no válido");
		}finally {
			teclado.nextLine();
		}
		return -1;
	}
	public static  void menu () {
		int opc;
		do {
			System.out.println("-----Opciones--------");
			System.out.println("-----1.Insertar------");
			System.out.println("-----2.Eliminar------");
			System.out.println("-----3.Modificar-----");
			System.out.println("-----4.Visualizar----");
			System.out.println("-----5.Salir---------");
			System.out.println("---escribe una opci�n---");
			opc=insertInt();

			switch(opc){
			case 1:
				insertar(); 
				break;
			case 2:
				eliminar();
				break;
			case 3:
				modificar();
				break;
			case 4:
				visualizar();
				break;
			}
		}while(opc>0 || opc<4);
	}
	public static void conectarBD() {
		try {
		mongo = new MongoClient( "localhost" , 27017 ); 
		database = mongo.getDatabase("AccesoDatos");
		} catch (MongoSocketOpenException e) {
            System.out.println("Error al conectarse con la base de datos");
        }
    }

	public static void insertar() {
		
		conectarBD();
		MongoCollection<Document> collection = database.getCollection("alumno"); 
		try {
		System.out.println("Escribe el ID del alumno");
		int insertarid=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Escribe el Nombre del alumno");
		String insertarnombre=teclado.nextLine();
		System.out.println("Escribe el Apellido del alumno");
		String insertarapellido=teclado.nextLine();
		System.out.println("Escribe el Curso del alumno");
		String insertarcurso=teclado.nextLine();
		System.out.println("Escribe la Fecha de Nacimiemto del alumno");
		String insertarfecha=teclado.nextLine();
		Document document = new Document("id", "MongoDB") 
				.append("id", insertarid)
				.append( "nombre", insertarnombre) 
				.append("apellidos", insertarapellido) 
				.append("grupo", insertarcurso)
				.append("fecha_nacimiento", insertarfecha);  
		collection.insertOne(document); 
		System.out.println("INSERTADO CON EXITO");
		}catch(MongoException ex){
			System.out.println("ERROR AL INSERTAR");
		}
	}
	public static void modificar(){
		conectarBD();
		int opc;
		System.out.println("QUE QUIERES MODIFICAR");
		System.out.println("1.ID");
		System.out.println("2.NOMBRE");
		System.out.println("3.APELLIDOS");
		System.out.println("4.GRUPO");
		System.out.println("5.FECHA DE NACIMIENTO");
		System.out.println("6.VOLVER AL MENU");
		System.out.println("ESCRIBE LA OPCION");
		opc=insertInt();
		switch (opc) {
		case 1:
			System.out.println("ESCRIBE EL ID DEL ALUMNO QUE QUIERES MODIFICAR");
			int modificarid=teclado.nextInt();
			System.out.println("ESCRIBE EL NUEVO ID QUE QUIERES PONER");
			int nuevoid=teclado.nextInt();
			database.getCollection("alumnos").updateOne(
					new BasicDBObject("id", modificarid),
					new BasicDBObject("$set", new BasicDBObject("id", nuevoid))
					);
			break;
		case 2:
			System.out.println("ESCRIBE EL ID DEL ALUMNO QUE QUIERES MODIFICAR");
			int modificarnombre=teclado.nextInt();
			teclado.nextLine();
			System.out.println("ESCRIBE EL NUEVO NOMBRE QUE QUIERES PONER");
			String nuevonombre=teclado.nextLine();
			database.getCollection("alumnos").updateOne(
					new BasicDBObject("id", modificarnombre),
					new BasicDBObject("$set", new BasicDBObject("nombre", nuevonombre))
					);
			break;
		case 3:
			System.out.println("ESCRIBE EL ID DEL ALUMNO QUE QUIERES MODIFICAR");
			int modificarapellidos=teclado.nextInt();
			teclado.nextLine();
			System.out.println("ESCRIBE EL NUEVO APELLIDO QUE QUIERES PONER");
			String nuevoapellido=teclado.nextLine();
			database.getCollection("alumnos").updateOne(
					new BasicDBObject("id", modificarapellidos),
					new BasicDBObject("$set", new BasicDBObject("apellidos", nuevoapellido))
					);
			break;
		case 4:
			System.out.println("ESCRIBE EL ID DEL ALUMNO QUE QUIERES MODIFICAR");
			int modificarcurso=teclado.nextInt();
			teclado.nextLine();
			System.out.println("ESCRIBE EL NUEVO GRUPO	 QUE QUIERES PONER");
			String nuevocurso=teclado.nextLine();
			database.getCollection("alumnos").updateOne(
					new BasicDBObject("id", modificarcurso),
					new BasicDBObject("$set", new BasicDBObject("grupo", nuevocurso))
					);
			break;
		case 5:
			System.out.println("ESCRIBE EL ID DEL ALUMNO QUE QUIERES MODIFICAR");
			int modificarfecha=teclado.nextInt();
			teclado.nextLine();
			System.out.println("ESCRIBE LA NUEVA FECHA DE NACIMIENTO QUE QUIERES PONER");
			String nuevofecha=teclado.nextLine();
			database.getCollection("alumnos").updateOne(
					new BasicDBObject("id", modificarfecha),
					new BasicDBObject("$set", new BasicDBObject("fecha_nacimiento", nuevofecha))
					);
			break;

		case 6:
			menu();
			break;
		}
	}
	public static void eliminar() {
		conectarBD();
		try {
		int id;
		System.out.println("escribe el id del alumno que desees eliminar");
		id=teclado.nextInt();
		MongoCollection<Document> collection = database.getCollection("alumnos");
		collection.deleteOne(new Document("id", id));
		System.out.println("ELIMIDADO CON EXITO");
		}catch(MongoException ex){
			System.out.println("ERROR AL ELIMINAR");
		}
	}
	public static void visualizar() {
		conectarBD();
		int opc;
		String visualizargrupo;
		int visualizarid;
		System.out.println("1.Visualizar todo");
		System.out.println("2.Visualizar por Grupo");
		System.out.println("3.Visualizar el alumno que desees por ID");
		System.out.println("4.volver al menu");
		System.out.println("Elige una opcion");
		opc=insertInt();
		switch (opc) {
		case 1:		 
			FindIterable<Document> iterable = database.getCollection("alumnos").find();//escribo el nombre de la coleccion
			for (Document document : iterable) {
				System.out.println("||---------------------------------------------------------------------||");
				System.out.println("||"+"ID: "+iterable.first().getInteger("id"));
				System.out.println("||"+"NOMBRE: "+iterable.first().getString("nombre"));
				System.out.println("||"+"APELLIDOS: "+iterable.first().getString("apellidos"));
				System.out.println("||"+"GRUPO: "+iterable.first().getString("grupo"));
				System.out.println("||"+"FECHA DE NACIMIENTO: "+iterable.first().getString("fecha_nacimiento"));
				System.out.println("||---------------------------------------------------------------------||");
			}
			break;
		case 2:
			System.out.println("Escribe el grupo que quieres visualizar");
			visualizargrupo=teclado.nextLine();
			FindIterable<Document> dc= database.getCollection("alumnos").find(new Document("grupo",visualizargrupo));
			for (Document document : dc) {
				System.out.println("||---------------------------------------------------------------------||");
				System.out.println("||"+"ID: "+dc.first().getInteger("id"));
				System.out.println("||"+"NOMBRE: "+dc.first().getString("nombre"));
				System.out.println("||"+"APELLIDOS: "+dc.first().getString("apellidos"));
				System.out.println("||"+"GRUPO: "+dc.first().getString("grupo"));
				System.out.println("||"+"FECHA DE NACIMIENTO: "+dc.first().getString("fecha_nacimiento"));
				System.out.println("||---------------------------------------------------------------------||");
			}
			
			break;
		case 3:
			System.out.println("Escribe el ID del alumno que quieres visualizar");
			visualizarid=teclado.nextInt();
			FindIterable<Document> ids= database.getCollection("alumnos").find(new Document("id",visualizarid));
			for (Document document : ids) {
				System.out.println("||---------------------------------------------------------------------||");
				System.out.println("||"+"ID: "+ids.first().getInteger("id"));
				System.out.println("||"+"NOMBRE: "+ids.first().getString("nombre"));
				System.out.println("||"+"APELLIDOS: "+ids.first().getString("apellidos"));
				System.out.println("||"+"GRUPO: "+ids.first().getString("grupo"));
				System.out.println("||"+"FECHA DE NACIMIENTO: "+ids.first().getString("fecha_nacimiento"));
				System.out.println("||---------------------------------------------------------------------||");

			}
			break;
		case 4:
			menu();
			break;

		}


	}
}


