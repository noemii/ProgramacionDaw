package Codicionales;

import java.util.Scanner;
 
public class programa_ph {

	public static void main(String[] args) {
		// 6.	Escribe un programa que pida el ph de una solución y muestre 
		//el mensaje de si la solución es ácida (ph < 7.0) o peligrósamente ácida: ph < 3.0).

		Scanner teclado = new Scanner (System.in);
		
		double ph;
		String solucion;
		
		System.out.println ("Indica el ph de una solución quimica");
		ph = teclado.nextDouble();
	
		
		if (ph < 7.0 && ph > 3){
			System.out.println ("La solución es ácida " );
		}else if (ph < 3.0){
			System.out.println ("La solución es peligrósamente ácida ");
		}else{
			System.out.println ("La solución no es peligrosa ");
		}
		
	}

}
