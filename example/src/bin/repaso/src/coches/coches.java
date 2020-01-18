package coches;

public class coches {
	private int id;

private  String marca,color,kilometros;
public coches(int id, String marca, String color, String kilometros) {
	super();
	this.id = id;
	this.kilometros = kilometros;
	this.marca = marca;
	this.color = color;
}
public coches() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getKilometros() {
	return kilometros;
}
public void setKilometros(String kilometros) {
	this.kilometros = kilometros;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String toString() {
	return "coches [id=" + id + ", kilometros=" + kilometros + ", marca=" + marca + ", color=" + color + "]";
}

/*no es necesario este metodo porque no voy a escribir un xml*/
public String toXml() {
	return "\t<coche id=\"" + id + "\">\r\n" +
            "\t\t<marca>" + marca + "</nombre>\r\n" +
            "\t\t<color>" + color + "</apellidos>\r\n" +
            "\t\t<kilometros>" + kilometros + "</grupo>\r\n" +
            "\t</coche>\r\n";

}

}
