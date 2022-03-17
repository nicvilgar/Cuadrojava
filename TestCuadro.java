package fp.cuadros.test;

import fp.cuadros.Cuadro;

public class TestCuadro {

	public static void main(String[] args) {
		System.out.println("\nTEST del Constructor");
		try {
			Cuadro irises = new Cuadro("Irises", "Vincent van Gogh", 1889, 110700000, 53900000, 1987,
					"Son of Joan Whitney Payson", "Alan Bond");
			System.out.println(irises);
		} catch (Exception e) {
			System.out.println("\nExcepción capturada");
		}
		
		System.out.println("\nTESTS con fallo del Constructor");
		try {
			System.out.println(new Cuadro("Irises", "Vincent van Gogh", -1889, 110700000, 53900000, 1987,
					"Son of Joan Whitney Payson", "Alan Bond"));
		} catch (Exception e) {
			System.out.println("\nExcepción capturada para año de obra negativo: "+e.getMessage());
		}
		try {
			System.out.println(new Cuadro("Irises", "Vincent van Gogh", 1889, -110700000, 53900000, 1987,
					"Son of Joan Whitney Payson", "Alan Bond"));
		} catch (Exception e) {
			System.out.println("\nExcepción capturada para precio de venta negativo: "+e.getMessage());
		}
		try {
			System.out.println(new Cuadro("Irises", "Vincent van Gogh", 1889, 110700000, -53900000, 1987,
					"Son of Joan Whitney Payson", "Alan Bond"));
		} catch (Exception e) {
			System.out.println("\nExcepción capturada para precio inicial negativo: "+e.getMessage());
		}
		try {
			System.out.println(new Cuadro("Irises", "Vincent van Gogh", 1889, 110700000, 53900000, -1987,
					"Son of Joan Whitney Payson", "Alan Bond"));
		} catch (Exception e) {
			System.out.println("\nExcepción capturada para año de venta negativo: "+e.getMessage());
		}
		try {
			System.out.println(new Cuadro("Irises", "Vincent van Gogh", 2000, 110700000, 53900000, 1987,
					"Son of Joan Whitney Payson", "Alan Bond"));
		} catch (Exception e) {
			System.out.println("\nExcepción capturada para año de venta anterior al de la obra: "+e.getMessage());
		}
	}
}
