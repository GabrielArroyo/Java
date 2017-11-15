import java.io.*;

public class FicheroTexto1 {
	
	public static void pintar(String[] lista) {
		System.out.println("Contenido de la tabla");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("posición "+ i + ": " + lista[i]);
		}
		
	}
	
	
	public static void escribirFichero(String[] lista){
		
try {
			
			//1. Crear fichero
			File fichero = new File("FicheroNombres.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			
			//2.Escribir nombres
			for (int i = 0; i < lista.length; i++) {
				ficheroEscritura.write(lista[i]);
				if(i!=(lista.length-1))
				ficheroEscritura.write(';');
			}
			
			//3. Cerrar fichero.
			ficheroEscritura.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void inicializar(String[] lista) {
		
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = "";
		}
		
	}
	
	public static void leerFichero(String[] lista) {
		
			File fichero = new File("FicheroNombres.txt");
			FileReader ficheroLectura;
			try {
				ficheroLectura = new FileReader(fichero);
				char[] nombres = new char[4];
				int res;
				String cadenaFichero = "";
				
					res = ficheroLectura.read(nombres);
					while(res != -1) {
						cadenaFichero = cadenaFichero + String.valueOf(nombres);
						res = ficheroLectura.read(nombres);
						}
					lista = cadenaFichero.split(";");
					ficheroLectura.close();
			
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}
	

	public static void main(String[] args) {
		
		String[] lista = {"pepe", "ana", "juan"};
		escribirFichero(lista);
		inicializar(lista);
		leerFichero(lista);
		pintar(lista);
	}

}
