package Bucles;

import java.util.Scanner;

public class tablamultiplicar_contador {

	public static void main(String[] args) {
		
 //1.	Imprimir la tablas de multiplicar que el usuario elija.
		
		Scanner teclado = new Scanner (System.in);
		
		int eleccion;
		int contador;
		
		contador = 1;
		
		System.out.println("Indica un numero para darte la tabla de multiplicar");
		eleccion = teclado.nextInt();
		
		while (contador <= 10){
		System.out.println(eleccion + " x " + contador + " = " + (eleccion * contador));
		contador++;
		}
		
		
	}

}
