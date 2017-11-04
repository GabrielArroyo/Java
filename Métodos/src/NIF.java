
public class NIF {
	int dni;
	char letra;
	private static char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','S','Q','V','H','L','C','K','E'};
	
	public NIF(char letra,int dni) {
		this.letra = letra;
		this.dni = dni;
	}
	
	public void escribe() {
		System.out.println(dni + "-" + letra);
	}
	
	public void calculaLetra() {
		int resto = (int) (dni % 23);
		 letra = letras[(int) resto];
		 System.out.println(letra);
	}
	public void compruebaLetra() {
		int resto = (int) (dni % 23);
		if (letra == letras[resto]) {
			System.out.println("La letra es correcta");
		}else {
			System.out.println("La letra es incorrecta");
		}
		
	}
	
	public int getDni() {
		return (int) dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
}
