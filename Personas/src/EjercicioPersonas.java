import java.io.*;
import java.util.Scanner;

public class EjercicioPersonas {

	static void EscribirPersonas(Persona [] gente) {
	
	
	try {
		
		File fichero = new File("Personas.txt");
		FileWriter ficheroEscritura = new FileWriter(fichero);
		BufferedWriter ficherobuffer = new BufferedWriter(ficheroEscritura);
		
		
		for (int i = 0; i < gente.length; i++) {
			
			ficherobuffer.write(gente[i].getNombre());
			ficherobuffer.newLine();
			ficherobuffer.write(gente[i].getEdad());
			ficherobuffer.newLine();
			ficherobuffer.write(gente[i].getApellido());
			ficherobuffer.newLine();
		}
		
		ficherobuffer.close();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}
	
	
	
	
	static void Vaciar(Persona [] gente) {
		
		for (int i = 0; i < gente.length; i++) {
			gente[i].setApellido(null);
			gente[i].setEdad(0);
			gente[i].setNombre(null);
		}
	}
	
	
	static int Menu() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		
		System.out.println("1º Escribir Fichero");
		System.out.println("2º Leer Fichero");
		System.out.println("3º Escribir Pantalla");
		System.out.println("4º Vaciar Estructura");
		System.out.println("5º Salir");
		num = Integer.parseInt(scan.nextLine());
		scan.reset();
		scan.close();
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Persona [] gente = {new Persona("Pepe","magneto",15), new Persona("Juan","Francisco",20),new Persona("Fernando","Silva",21),
							new Persona("Alejandro","sanz",77),new Persona("Gabriel","Arroyo",50)};
	
		do {
		num = Menu();
		switch (num) {
		case 1:
			EscribirPersonas(gente);
			break;

		default:
			break;
		}
		}while(num != 5);
		
		
	
	}

}
