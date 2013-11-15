package Bucles;

import java.util.Scanner;

public class num_negativo {

	public static void main(String[] args) {
		// 4.	Escribir un programa que lea tantos números como el usuario quiera 
		//(hasta que se inserte un número negativo). El primer número hay que visualizarlo en la pantalla.
		
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		
		do{
			numero = teclado.nextInt();
		}while(numero >= 0);

	}

}
