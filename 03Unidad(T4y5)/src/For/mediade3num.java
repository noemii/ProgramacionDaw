package For;

import java.util.Scanner;

public class mediade3num {

	public static void main(String[] args) {
		//Hacer programa Que pida 3 numeros y devuelva la media
		
		Scanner teclado = new Scanner (System.in);
		
		int numero = 0;
		double suma = 0;
		System.out.println("Indica 3 numeros");
		
		for (int linea = 1; linea<=3; linea++){
			numero = teclado.nextInt();
			suma = suma + numero;  // o suma = suma + teclado.nextInt();
		}
	 	 System.out.println("la media es " + (Math.round(suma/3*100) / 100.0));
	
	 	 
	 	 //for (int linea = 3; linea>0; linea--){
			//numero = teclado.nextInt();
		//	suma = suma + numero;  // o suma = suma + teclado.nextInt();
		}
	}

