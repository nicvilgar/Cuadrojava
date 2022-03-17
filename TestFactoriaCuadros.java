package fp.cuadros.test;

import fp.cuadros.Cuadros;
import fp.cuadros.FactoriaCuadros;

public class TestFactoriaCuadros {

	
	public static void main(String[] args) {
		testCreacionCuadros();
	}

	private static void testCreacionCuadros() {
		System.out.println("\nTEST de la creacion de cuadros");
		try {
			Cuadros cuadros = FactoriaCuadros.leerCuadros("data/cuadros.csv");
			System.out.println("   CUADROS: "+ cuadros);
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}


}
