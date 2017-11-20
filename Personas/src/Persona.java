import java.io.BufferedWriter;
import java.io.IOException;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Persona(String nombre,String apellido,int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void escribirFichero(BufferedWriter f) {
		
		try {
		f.write(nombre);
		f.newLine();
		f.write(apellido);
		f.newLine();
		f.write(String.valueOf(edad));
		f.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	



}


