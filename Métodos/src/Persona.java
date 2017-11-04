
public class Persona {
	String nombre;
	String apellidos;
	Fecha FNacimiento = new Fecha(0, 0, 0);
	NIF DNI = new NIF('u', 0);
	
	public Persona() {
	Persona primero = new Persona();
	primero.nombre = "Gabriel";
	primero.apellidos = "Arroyo Pajares";
	primero.FNacimiento.setDia(3);
	primero.FNacimiento.setMes(7);
	primero.FNacimiento.setAnio(1996);
	primero.DNI.dni = 1672589;
	
	}
}
