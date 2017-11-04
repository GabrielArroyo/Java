import java.io.*;
import java.util.Scanner;
public class CrearFicheros {

	public static void main(String[] args) {
		
		Scanner carpeta = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		
		System.out.println("Dame el nombre de la carpeta");
		String nombreCarpeta = carpeta.next();
		
		System.out.println("Dime el nombre del fichero");
		String b = a.next();
		
		File directorio = new File(nombreCarpeta);
		directorio.mkdir(); 
		File fichero = new File(b);
		try {
			
			if(fichero.createNewFile() == true ) {
				System.out.println("El fichero se ha creado");
			}else {
				System.out.println("Esta creado");
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

                                                            