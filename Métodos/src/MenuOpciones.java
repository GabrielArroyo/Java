import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MenuOpciones {
	public static int menu() {
		System.out.println("1º Crear fichero");
		System.out.println("2º Mostrar información del fichero");
		System.out.println("3º Mostrar longitud del fichero");
		System.out.println("4º Comprobar si existe el fichero");
		System.out.println("5º Borrar fichero");
		System.out.println("6º Salir");
		System.out.println("Dime la opción que quieres elegir");
		
		Scanner menu = new Scanner(System.in);
		int numero;
		numero = menu.nextInt();
		
		return numero;
	}
	
	static public void datos(File f) {
		if(f.exists()) {
		System.out.println("INFORMACION DEL FICHERO" + "\n");
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.length()+ "\n");
		}else {
			System.out.println("El fichero no se ha encontrado");
		}
		
		
	}
	static public void longitud(File f) {
		if(f.exists()) {
		System.out.println("La longitud de tu fichero es: ");
		System.out.println(f.length()+ "\n");
		}else {
			System.out.println("No hay fichero");
		}
		
	}
	public static void main(String[] args) {
	
	Scanner menu = new Scanner(System.in);
	File fichero = null;
	int numero;
		
		do {
			numero = menu();
		switch (numero) {
		case 1:
			Scanner a = new Scanner(System.in);
			System.out.println("Dime el nombre del fichero con .txt al final");
			String b = a.next();
			fichero = new File(b);
			try {
				fichero.createNewFile();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			datos(fichero);
			break;
		case 3:
			longitud(fichero);
			break;
		case 4:
			System.out.println("Si tu fichero existe debajo mia habra un TRUE");
			System.out.println(fichero.exists()+ "\n");
			break;
		case 5:
			System.out.println("Lo siento pero ahora borrare el fichero, lo demas era naruto (relleno)");
			fichero.delete();
			System.out.println();
			break;
		case 6:
			System.out.println("Adios");
			break;
		default:
			System.out.println("Tiene que ser un numero comprendido entre el 1-6" + "\n");
			break;
		}
		}while(numero != 6);
		
	
	}

}
