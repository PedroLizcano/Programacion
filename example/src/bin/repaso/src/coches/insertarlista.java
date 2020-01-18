package coches;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.w3c.dom.Document;



import static coches.DOM.parsearXml;
import static coches.DOM.recorrerDom;


public class insertarlista {
	private static PreparedStatement preparedStatement;
	private static Connection connection;
	public static void main(String[]args) throws SQLException {
		Document document = parsearXml(new File("salida\\concesionario.xml"));
		List<coches> coche = recorrerDom(document);
		conectarBbdd();
		String query="insert into coches(id,marca,color,kilometros) values(?,?,?,?)";
		preparedStatement = connection.prepareStatement(query);
		for(coches f:coche) {
			preparar(f.getId(), f.getMarca(), f.getColor(), f.getKilometros());
			preparedStatement.executeUpdate();
		}
		preparedStatement.close();
		connection.close();
	}
	public static void preparar(int id,String marca,String color,String kilometros) throws SQLException {
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, marca);
		preparedStatement.setString(3, color);
		preparedStatement.setString(4,kilometros);
	}

	private static void conectarBbdd() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/accesodatos?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		connection = DriverManager.getConnection(url, "root", "gmq2019");
	}

}
