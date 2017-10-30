import java.util.Iterator;

public class Concesionario {
	
/*	public void ordenar(Coche c9) {
		for(int i = 0;i < c9.getId();i++) {
		System.out.println("Hola");
		}
	}*/

		public static  void ordenarCaballo(Coche c1[]){
			Coche c2 = new Coche();
			for (int i = 0; i < c1.length; i++) {
			for(int j = 0; j < c1.length;j++){
				if(c1[j].getnCaballos() > c1[i].getnCaballos()) {
					c2 = c1[i];
					c1[i] = c1[j];
					c1[j] = c2;
					}
			}	
			}
		}
		
		public static void Retirar(Coche c1[]) {
			
			for (int i = 0; i < c1.length; i++) {
			c1[i].setMatricula("0000xxx");
			}
			
		}
	
	public static void main(String[] args) {
		// Escribir por pantalla los coches ordenados por nº caballos
		// Retirar todos coches concesionario, Matricula = m "0000xxx"
		// Comprobar el funcionamiento de los vehículos que se encuentran parados fijado la marcha a 0
		 Coche c1[] = {new Coche(100, "DELANTE", 0, "1561M"),
					  new Coche(150,"DELANTE",-1,"589MSW"),
					  new Coche(80,"ATRAS", -1,"12WER")};
		
		
		c1[0].Arrancar();
		c1[0].girar("D");
		
		c1[1].girar("I");
		
		c1[2].Arrancar();
		c1[2].girar("I");
		c1[2].parar();
		
		c1[0].setDireccion("NINGUNA");
		
		//Retirar(c1);
		
		ordenarCaballo(c1);
		
		System.out.println(c1[0].estado());
		System.out.println(c1[1].estado());
		System.out.println(c1[2].estado());
		
	}

}
