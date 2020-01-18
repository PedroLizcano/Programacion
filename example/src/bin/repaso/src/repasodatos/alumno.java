package repasodatos;



public class alumno {
private int id;
private  String nombre,apellido,fecha/*,id en el caso de que el xml lo haya conseguido de un Json*/;
private  grupo curso;

public alumno(int id, String nombre, String apellido, grupo curso, String fecha) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.curso = curso;
    this.fecha = fecha;
}

public alumno() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public grupo getCurso() {
	return curso;
}
public void setCurso(grupo curso) {
	this.curso = curso;
}
public  String toXml() {
    return  "\t<alumno id=\"" + id + "\">\r\n" +
            "\t\t<nombre>" + nombre + "</nombre>\r\n" +
            "\t\t<apellidos>" + apellido + "</apellidos>\r\n" +
            "\t\t<grupo>" + curso + "</grupo>\r\n" +
            "\t\t<fecha_nacimiento>" + fecha + "</fecha_nacimiento>\r\n" +
            "\t</alumno>\r\n";
}

@Override
public String toString() {
    return 
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", apellidos='" + apellido + '\'' +
            ", grupo='" + curso + '\'' +
            ", fechaNacimiento='" + fecha + '\'' +
            '}';
}

public String toTxt() {
    return  "ID: " + id + "\r\n" +
            "NOMBRE: " + nombre + "\r\n" +
            "APELLIDOS: " + apellido + "\r\n" +
            "GRUPO: " + curso + "\r\n" +
            "FECHA DE NACIMIENTO: " + fecha;
}


	// TODO Auto-generated method stub
	

}
