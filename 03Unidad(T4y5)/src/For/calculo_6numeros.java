package For;

import java.util.Scanner;

public class calculo_6numeros {

	public static void main(String[] args) {
		// 3.	Escribe un programa que calcule la suma de 6 números que inserte el usuario a través del teclado.
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		int contador;
		int suma = 0;
		
		for(contador=0;contador<6;contador++){
			numero = teclado.nextInt();
			suma = suma + numero;
		}
		System.out.println("La suma total de los numeros introducidos es: " + suma);
	}

}
