package Bucles;

import java.util.Scanner;

public class pedir_hastapar {

	public static void main(String[] args) {
		// 3.	Escribir un programa que pida varios números hasta que el 
		//usuario inserte un número par. Hay que ir mostrando cada uno de los números insertados (excepto el par).

		
		int numero = 1;
		Scanner teclado = new Scanner (System.in);
		
		
		while(numero%2 != 0){		
			numero = teclado.nextInt();
			if(numero%2 != 0){
			System.out.println("El numero insertado es: " + numero);
			}
		}
		
		
		
		
	}

}
