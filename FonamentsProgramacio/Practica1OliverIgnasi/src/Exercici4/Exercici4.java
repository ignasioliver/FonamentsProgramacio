package Exercici4;

import Keyboard.*;

public class Exercici4 {
	public static void main (String args[]) {
		double costatpetitcm, costatpetitpolzades, costatgrancm, costatgranpolzades;
		double diagonalcm, diagonalpolzades;
		
		System.out.println("MIDES D'UNA PANTALLA DE TELEVISOR");
		System.out.println("***** * *** ******** ** *********");
		System.out.println();
		System.out.print("Quina es la mida en polzades de la diagonal? ");
		
		diagonalpolzades = Keyboard.readDouble();
		costatpetitpolzades = diagonalpolzades * 0.49;
		costatgranpolzades = diagonalpolzades * 0.49 * 16 / 9;
		
		diagonalcm = Math.round(diagonalpolzades * 2.54);
		costatpetitcm = Math.round(costatpetitpolzades * 2.54);
		costatgrancm = Math.round(costatgranpolzades * 2.54);
		
		System.out.println();
		System.out.println("Un televisor de " + diagonalpolzades + " polzades (" + diagonalcm + " centimetres)");
		System.out.println("te un costat petit de " + costatpetitcm + " centimetres (" + costatpetitpolzades + " polzades)");
		System.out.print("i un costat gran de " + costatgrancm + " centimetres (" + costatgranpolzades + " polzades)");
	}
}