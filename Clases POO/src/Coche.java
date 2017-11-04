
public class Coche {

	//Atributos
	
	private int nCaballos;
	private String direccion;
	private int marcha;
	private static int id = 0;
	private String matricula;
	//Constructor
	public Coche() {
		
		nCaballos = 5;
		direccion = "Parado";
		marcha = 0;
		matricula = "Desconocida";
		
	}
	public Coche(int nCaballos, String direccion, int marcha, String matricula) {
		this.nCaballos = nCaballos;
		this.direccion = direccion;
		this.marcha = marcha;
		this.matricula = matricula;
		id++;
	}
	
	public void Arrancar() {
		direccion = "DELANTE";
		marcha++;
		
	}
	
	public void girar(String dir) {
		if(dir == "I") 
			direccion = "IZQUIERDA";
		else if(dir == "D")
			direccion = "DERECHA";		
		
		
		
	}
	public void parar() {
		marcha = 0;
		direccion = "PARADO";
		
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public int getnCaballos() {
		return nCaballos;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String estado() {
		
		return "caballos: " + nCaballos + " Direccion: " + direccion + " Marcha: " + marcha + " matricula: " + matricula;
	}
	public void comprobar() {
		if(direccion == "PARADO")
			marcha = 0;
	}
	
	
}