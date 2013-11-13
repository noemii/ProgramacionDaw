package Codicionales;

import java.util.Scanner;

public class palabraoculta {

	public static void main(String[] args) {
		// 2.	Crea un programa que tiene una palabra oculta. 
		//El programa pregunta la contraseña al jugador, si la adivina muestra un mensaje de éxito. Si no, muestra el error.
		
		Scanner teclado = new Scanner(System.in);
		String oculta = "Pedro3621";
		String palabraSecreta;
		
		System.out.println("Indique la contraseña");
		palabraSecreta = teclado.next();
		
		while (!oculta.equals(palabraSecreta)){   //equals para comparar Strings
			System.out.println("Contraseña erronea");
			
			palabraSecreta = teclado.next();
			if (oculta.equals(palabraSecreta)) {
				System.out.println("Contraseña ACERTADA");
			}
		}
		
		
		
		
		
		
		
		
	}

}
