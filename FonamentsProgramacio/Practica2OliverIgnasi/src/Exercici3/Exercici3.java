package Exercici3;

import Keyboard.*;

public class Exercici3 {
	public static void main (String args[]){
		double quantitat, diners;
		int eleccio;
		System.out.print("Entra la quantitat a convertir ");
		quantitat = Keyboard.readDouble();
		System.out.println("Escull segons siguin euros o pessetes la quantitat indicada");
		System.out.println("  1.- Euros\n  2.- Pessetes");
		eleccio = Keyboard.readInt();
		System.out.println("------------------------");
		if (eleccio == 1){
			diners = quantitat * 166.386;
			System.out.println(quantitat + " euros són " + Math.round(diners) + " pessetes");
		}else if (eleccio == 2){
			diners = quantitat / 166.386;
			System.out.println(quantitat + " pessetes són " + diners + " euros");
		}else System.out.print("Selecció no correcta.");
	}
}