package Codicionales;

import java.util.Scanner;
 
public class programa_ph {

	public static void main(String[] args) {
		// 6.	Escribe un programa que pida el ph de una soluci�n y muestre 
		//el mensaje de si la soluci�n es �cida (ph < 7.0) o peligr�samente �cida: ph < 3.0).

		Scanner teclado = new Scanner (System.in);
		
		double ph;
		String solucion;
		
		System.out.println ("Indica el ph de una soluci�n quimica");
		ph = teclado.nextDouble();
	
		
		if (ph < 7.0 && ph > 3){
			System.out.println ("La soluci�n es �cida " );
		}else if (ph < 3.0){
			System.out.println ("La soluci�n es peligr�samente �cida ");
		}else{
			System.out.println ("La soluci�n no es peligrosa ");
		}
		
	}

}
