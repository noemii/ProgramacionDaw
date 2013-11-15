package Bucles;

import java.util.Scanner;

public class tablamultiplicar_acumulador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Tabla del: ");
		int eleccion= teclado.nextInt();
		int linea, multiplicacion;
		
		linea = 1;
		multiplicacion=eleccion;
		while (linea <= 10){
		System.out.println(eleccion + " x " + linea + " = " + (multiplicacion));
		linea++;
		multiplicacion = multiplicacion + eleccion;
		}

	}

}
