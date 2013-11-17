package BuclesWhile;

import java.util.Scanner;

public class num_negativo {

	public static void main(String[] args) {
		// 4.	Escribir un programa que lea tantos números como el usuario quiera 
		//(hasta que se inserte un número negativo). El primer número hay que visualizarlo en la pantalla.
		
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		
		/*do{
			numero = teclado.nextInt();
			System.out.println("El primer numero es: " + numero);
			
		}while(numero >= 0);*/

		 while(numero>=0){
		 numero = teclado.nextInt();}
		 
		 System.out.println("Numero introducido: + numero");
		 System.out.println("Numero negativo introducido :" + (numero<0));
		
		 
	}
}


