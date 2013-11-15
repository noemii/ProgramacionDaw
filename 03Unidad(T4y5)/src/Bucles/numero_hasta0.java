package Bucles;

import java.util.Scanner;

public class numero_hasta0 {

	public static void main(String[] args) {
	//2.Pedir números hasta que se inserte un 0. Mostrar la cantidad de números leídos y el resultado de multiplicar todos ellos

		Scanner teclado = new Scanner (System.in);
		
		int numeros = 0;
		int resultado = 1;
		int contador = -1;  //contador = 0  **1
	
		do {
			numeros = teclado.nextInt();
			
			//if (numeros == 0) break;  **1
			if (numeros != 0) resultado = resultado * numeros;
			contador++;
			
			//resultado = resultado * numeros;  **1
			
			
		}while (numeros != 0);
		
		
		System.out.println("He leido: " + contador + " numeros");
		System.out.println("el resultado de multiplicar todos ellos es: " +  resultado);
		
	}

}
