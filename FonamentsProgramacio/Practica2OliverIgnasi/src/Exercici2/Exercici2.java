package Exercici2;

import Keyboard.*;

public class Exercici2 {
	public static void main (String args[]){
		int un, dos, tres;
		System.out.println("Especifica els 3 valors");
		System.out.println("***********************");
		System.out.println();
		System.out.print("Valor 1: ");
		un = Keyboard.readInt();
		System.out.print("Valor 2: ");
		dos = Keyboard.readInt();
		System.out.print("Valor 3: ");
		tres = Keyboard.readInt();
		System.out.print("Ordenacio de petit a gran: ");
		if (un < dos && un < tres && dos < tres){
			System.out.print(un + " " + dos + " " + tres);
		
		}else if (un < dos && un < tres && tres < dos){
			System.out.print(un + " " + tres + " " + dos);
		
		}else if (dos < un && dos < tres && un < tres){
			System.out.print(dos + " " + un + " " + tres);
		
		}else if (dos < un && dos < tres && tres < un){
			System.out.print(dos + " " + tres + " " + un);
		
		}else if (dos < un && dos < tres && tres < un){
			System.out.print(tres + " " + un + " " + dos);
		
		}else if (tres < dos && tres < un && dos < un){
			System.out.print(tres + " " + dos + " " + un);
		
		}else if (un == dos && un < tres){
			System.out.print(un + " " + dos + " " + tres);
		
		}else if (un == dos && un > tres){
			System.out.print(tres + " " + un + " " + dos);
		
		}else if (un == tres && un < dos){
			System.out.print(un + " " + tres + " " + dos);
		
		}else if (un == tres && un > dos){
			System.out.print(dos + " " + un + " " + tres);
		
		}else if (dos == tres && dos < un){
			System.out.print(dos + " " + tres + " " + un);
	
		}else if (dos == tres && dos > un){
			System.out.print(un + " " + dos + " " + tres);
	
		}else if (un == dos && dos == tres){
			System.out.print(un + " " + dos + " " + tres);
	
		}else{System.out.print("S'ha produit un error. Torna a executar el programa");}
	}
}