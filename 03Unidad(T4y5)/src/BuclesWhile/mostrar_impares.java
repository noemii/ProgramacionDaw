package BuclesWhile;

import java.util.Scanner;

public class mostrar_impares {

	public static void main(String[] args) {
		//5.	Escribe un programa que lea una serie de n�meros, muestre el primero, no el segundo, 
		//si el tercero y as� sucesivamente. Termina cuando insertamos un n�mero negativo. El n�mero negativo no se imprimir�.

		
			Scanner teclado = new Scanner (System.in);
			
			int numero;
			boolean imprimir;
			String resultado = "";
			
			imprimir = true;
			
			do{
				System.out.println("introduzca un numero : ");
				numero = teclado.nextInt();
				if (imprimir && numero >=0) {  // si quito el numero mayor a 0 tambien me sacara el negativo.
					resultado = resultado + numero + " "; //System.out.println("el numero introducido es: " + numero);
					}
				imprimir = !imprimir;  //ahora cambia a falso
				
			}while (numero>=0);
			
			System.out.println(resultado);
			
			System.out.println("Imprime solo las cadenas impares por eso se salta el segundo numero introducido");
			teclado.close();
	}

}
