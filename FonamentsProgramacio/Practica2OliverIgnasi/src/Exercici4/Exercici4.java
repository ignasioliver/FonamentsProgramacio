package Exercici4;

import Keyboard.*;

public class Exercici4 {
	public static void main (String args[]){
		double m, l, imc;
		System.out.println("Classificacio de l'IMC");
		System.out.println("------------- -- - ---");
		System.out.println("Quin es el teu pes (en kg.)?");
		m = Keyboard.readDouble();
		System.out.println("Quina es la teva alcada (en m.)?");
		l = Keyboard.readDouble();
		imc = m / Math.pow(l, 2);
		System.out.println("El teu IMC es: " + imc);
		if (imc < 18){
			System.out.println("aixo indica INFRAPES");
		}else if (imc > 18 && imc < 25){
			System.out.println("aixo vol dir que es NORMAL");
		}else if (imc > 25){
			System.out.println("aixo indica OBESITAT");
		}
	}
}