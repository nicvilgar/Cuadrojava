package fp.cuadros.test;

import java.util.ArrayList;
import java.util.List;

import fp.cuadros.Cuadro;
import fp.cuadros.Cuadros;

public class TestCuadros {
	  private static Cuadros cuadros;
	  
	  public static void main(String[] args) {
	    testConstructor();
	    testCalcularNumeroCuadrosArtista();
	    testCalcularCuadrosPorComprador();
	    testCalcularCuadrosPeriodoPrecioVenta();
	  }

	  public static void testConstructor() {
	    System.out.println("\n"
	            + "TEST Constructor");
	    List<Cuadro>l=new ArrayList<>();
	    l.add(new Cuadro("Irises","Vincent van Gogh",1889,110700000,53900000,1987,"Son of Joan Whitney Payson","Alan Bond"));
	    l.add(new Cuadro("Black Fire I","Barnett Newman",1961,84200000,84200000,2014,"Private Collection","Anonymous"));
	    l.add(new Cuadro("Three Studies for a Portrait of John Edwards","Francis Bacon",1984,80800000,80800000,2014,"Private Collection","Anonymous"));
	    l.add(new Cuadro("Untitled","Mark Rothko",1952,66200000,66200000,2014,"Private Collection","Anonymous"));
	    l.add(new Cuadro("Salvator Mundi","Leonardo Da Vinci",1490,78900000,77500000,2013,"Robert Simon","Anonymous"));
	    l.add(new Cuadro("Garçon à la pipe","Pablo Picasso",1905,130600000,104200000,2004,"Greentree foundation (Whitney family)","Barilla Group"));
	    l.add(new Cuadro("Dora Maar au Chat","Pablo Picasso",1941,111500000,95200000,2006,"Gidwitz family","Boris Ivanishvili"));
	    l.add(new Cuadro("No. 5, 1948","Jackson Pollock",1948,164700000,140000000,2006,"David Geffen","David Martinez"));
	    l.add(new Cuadro("Portrait of Alfonso d'Avalos, Marquis of Vasto, in Armor with a Page","Titian",1533,90000000,70000000,2003,"AXA insurance company","Getty Museum"));
	    l.add(new Cuadro("Portrait of a Halberdier","Pontormo",1537,67400000,35200000,1989,"Chauncey Devereaux Stillman","Getty Museum"));
	    cuadros=new Cuadros();
	    try {
	    	for(Cuadro c:l) {
	    		cuadros.añadirCuadro(c);
	    	}
	    	System.out.println(cuadros);
	    } catch (Exception e) {
	      System.out.println("\n"
	              + "Excepción capturada");
	    }
	  }

	  public static void testCalcularNumeroCuadrosArtista() {
	    System.out.println("\n"
	            + "TEST testCalcularNumeroCuadrosArtista: probando Picasso");
	    try {
	    	System.out.println(cuadros.calcularNumeroCuadrosArtista("Pablo Picasso"));
	    } catch (Exception e) {
	      System.out.println("\n"
	              + "Excepción capturada");
	    }
	  }

	  public static void testCalcularCuadrosPeriodoPrecioVenta() {
		    System.out.println("\n"
		            + "TEST testCalcularCuadrosPeriodoPrecioVenta: probando 1800 - 1950, con un precio mínimo de 120,000,000$");
		    try {
		    	System.out.println(cuadros.calcularCuadrosPeriodoPrecioVenta(1800, 1950, 120000000));
		    } catch (Exception e) {
		      System.out.println("\n"
		              + "Excepción capturada");
		    }
		  }
	  
	  public static void testCalcularCuadrosPorComprador() {
	    System.out.println("\n"
	            + "TEST testCalcularCuadrosPorComprador");
	    try {
	    	System.out.println(cuadros.calcularCuadrosPorComprador());
	    } catch (Exception e) {
	      System.out.println("\n"
	              + "Excepción capturada");
	    }
	  }


}
