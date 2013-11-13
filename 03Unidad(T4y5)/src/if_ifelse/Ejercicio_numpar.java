package if_ifelse;

import java.util.Scanner;
public class Ejercicio_numpar {

	public static void main(String[] args) {
		// Escribe un programa que pida un número con el fin de visualizarlo, siempre que dicho número sea par
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int numero;
		System.out.println("Escribe un numero");
		numero = teclado.nextInt();
	
		
		if(numero%2 == 0){
			System.out.printf("el numero %d es par ", numero);
			//System.out.print("el numero " + numero + "es par");
		}else{
			System.out.printf("el numero %d es impar",numero);
		}
	
	}

}
