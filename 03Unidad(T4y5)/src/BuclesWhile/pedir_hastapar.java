package BuclesWhile;

import java.util.Scanner;

public class pedir_hastapar {

	public static void main(String[] args) {
		// 3.	Escribir un programa que pida varios números hasta que el 
		//usuario inserte un número par. Hay que ir mostrando cada uno de los números insertados (excepto el par).

		Scanner teclado = new Scanner (System.in);
		/*int numero = 1;
		System.out.println("elige un numero: ");
		numero = teclado.nextInt();
		String cadena = "";
		
		while(numero%2 != 0){	
			System.out.println(numero);
			cadena = cadena + numero + "";
			System.out.println("Elige un numero:");
			numero = teclado.nextInt();
			}
			
		System.out.println(cadena + "");*/
	
		
		//DANI
		/*
		 * 
		 * 
		 */
		System.out.println("Elige un numero: ");
		String cadena = " ";
		int numero;
		boolean par; //*4(otra forma)  le quitariamos
		
		do{
			numero = teclado.nextInt();
			par=numero%2==0;  //*4 le quitariamos
			
			if (!par){  //*4 seria numero%2 == 0
			cadena = cadena + " " + numero + " ";
			System.out.println("Elige un numero");
			}
		}while (!par); //*4 seria numero%2 == 0
		
		System.out.println("Ipares: " + cadena);
	}

}