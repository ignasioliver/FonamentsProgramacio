package Exercici3;

import Keyboard.*;

public class Exercici3 {
	public static void main (String args[]) {
		double hEnKm, TempsTerra, TempsLluna, TrencatTerra, TrencatLluna;
	    System.out.println();
	    System.out.println("TEMPS DE CAIGUDA D'UN SÒLID (sense fregament)");
	    System.out.println("----- -- ------- ---- -----");
	    System.out.println();
	    System.out.print("Alçada inicial (en km): ");
	    hEnKm = Keyboard.readDouble();
	    TrencatTerra = (hEnKm * 1000 * 2) / 9.8;
	    TrencatLluna = (hEnKm * 1000 * 2) / 1.6;
	    TempsTerra = Math.sqrt(TrencatTerra);
	    TempsLluna = Math.sqrt(TrencatLluna);
	    TempsTerra = Math.round(TempsTerra);
	    TempsLluna = Math.round(TempsLluna);
	    System.out.println();
	    System.out.println("Un objecte llençat des de " + (hEnKm * 1000) + " metres");
	    System.out.println("trigarà  en arribar a la superfície " + TempsTerra + " segons, si és a la Terra");
	    System.out.println("però a la lluna trigarà  " + TempsLluna + " segons.");
	}
}