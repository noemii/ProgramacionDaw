package For;

import java.util.Scanner;

public class media_y_par {

	public static void main(String[] args) {
		// 4.	Escribe un programa que pida tantos n�meros como el usuario del programa 
		//indique al principio. El programa mostrar� al final la media y si se ha insertado un n�mero par.

		Scanner teclado = new Scanner(System.in);
		int numero = 1;
		int suma = 0;
		double media;
		int contador;
		String sumaif = " ";
		int numeros;
		
		System.out.println("Cuantos numeros quieres?");
		numeros=teclado.nextInt();
		
		System.out.println("Indica los numeros");
		for(contador=0; contador<numeros; contador++){
		numero=teclado.nextInt();
		suma = suma + numero;
		
			if(numero%2 == 0){
				sumaif = sumaif + " " + numero + " " ;
			}
		}
		
		
		media = suma / 5;
		System.out.println("La media de los numeros pares introducidos es: " + media);
		
		System.out.print("los numeros introducidos son:" + sumaif + " ");
		}
	}
	
	


