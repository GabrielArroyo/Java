
public class Fecha {
	private int dia = 1;
	private int mes = 1;
	private int anio = 2000;
	
	public Fecha(int d,int m, int a) {
		dia = d;
		mes = m;
		anio = a;
		
	}
	
	public void correcta()  {
		if(dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anio <= 2017 && anio >= 1900) {
		}
		else {
			System.out.println("El día esta mal");
		}
	}
	
	public void escribirCorto() {
		
		System.out.println(dia + "/" + mes + "/" + anio);
	
	}

	public void escribeLarga() {
		
		System.out.println("día " + dia+ " " + "del mes " + mes + " " + "del año " + anio);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int d) {
		dia = d;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int m) {
		mes = m;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int a) {
		anio = a;
	}
	
	
}
