package BuclesWhile;

import java.util.Scanner;

public class tablamultiplicar_DoWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Tabla del: ");
		int eleccion= teclado.nextInt();
		int linea;
		
		linea = 1;
		do{
		
		System.out.println(eleccion + " x " + linea + " = " + (eleccion * linea));
		linea++;
		
		}while (linea <= 10);

	}

}
