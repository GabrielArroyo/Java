import java.io.*;
import java.util.Scanner;





public class EjercicioPersonas {

	static void EscribirPersonasv2(Persona [] gente) {
	
	
	try {
		
		File fichero = new File("Personas.txt");
		FileWriter ficheroEscritura = new FileWriter(fichero);
		BufferedWriter ficherobuffer = new BufferedWriter(ficheroEscritura);
		
		
		for (int i = 0; i < gente.length; i++) {
			gente[i].escribirFichero(ficherobuffer);
		}
		
		ficherobuffer.close();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

	static void EscribirPersonas(Persona [] gente) {
	
	
	try {
		
		File fichero = new File("Personas.txt");
		FileWriter ficheroEscritura = new FileWriter(fichero);
		BufferedWriter ficherobuffer = new BufferedWriter(ficheroEscritura);
		
		
		for (int i = 0; i < gente.length; i++) {
			
			ficherobuffer.write(gente[i].getNombre());
			ficherobuffer.newLine();
			ficherobuffer.write(gente[i].getApellido());
			ficherobuffer.newLine();
			ficherobuffer.write(String.valueOf(gente[i].getEdad()));
			ficherobuffer.newLine();
		}
		
		ficherobuffer.close();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	static void LeerPersonas(Persona[] lista) {
		
		
		try {
			
			File fichero = new File("Personas.txt");
			FileReader ficheroEscritura = new FileReader(fichero);
			BufferedReader ficherobuffer = new BufferedReader(ficheroEscritura);
			
			String linea;
			int i=0;
			
			linea=ficherobuffer.readLine();
			while(linea != null) {
				
				lista[i].setNombre(linea);
				linea=ficherobuffer.readLine();
				lista[i].setApellido(linea);
				linea=ficherobuffer.readLine();
				lista[i].setEdad(Integer.parseInt(linea));
				i++;
				linea=ficherobuffer.readLine();
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
	
	static void Escribir(Persona[] gente) {
		
		for (int i= 0; i < gente.length; i++) {
		System.out.println("Nombre: " + gente[i].getNombre());	
		System.out.println("Apellido: " + gente[i].getApellido());
		System.out.println("Edad: " + gente[i].getEdad());
		
		}
		
	}
	
	static int Menu() {
		System.out.println("1º Escribir Fichero");
		System.out.println("2º Leer Fichero");
		System.out.println("3º Escribir Pantalla");
		System.out.println("4º Vaciar Estructura");
		System.out.println("5º Escribir Fichero v2");
		System.out.println("6º Salir");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.reset();
		return numero;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Persona [] gente = {new Persona("Pepe","magneto",15), new Persona("Juan","Francisco",20),new Persona("Fernando","Silva",21),
							new Persona("Alejandro","sanz",77),new Persona("Gabriel","Arroyo",50)};
	
		
		do {
		num = Menu();
		switch (num) {
		case 1:
			EscribirPersonas(gente);
			break;
		case 2:
			LeerPersonas(gente);
			break;
		case 3:
			Escribir(gente);
			break;
		case 4:
			Vaciar(gente);
			break;
		case 5:
			EscribirPersonasv2(gente);
			break;
		}
		}while(num != 6);
	
	}

}
