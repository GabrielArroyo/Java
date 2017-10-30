
public class MetodosClase {
	
	public static Fecha crearFecha() {
		
		Fecha Fecha = new Fecha(0, 0, 0);
		
		
		return Fecha;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1;
		f1 = crearFecha();
		NIF primero = new NIF('Y',1672589);
		
		
		primero.calculaLetra();
		primero.compruebaLetra();
		f1.escribirCorto();
		f1.escribeLarga();
		
	}

}