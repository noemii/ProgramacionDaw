package EjerciciosMetodosAngel;

import java.util.Scanner;

public class euroDolar {

	public static void main(String[] args) {
		//Escribir un método que convierta de euros a dólares. Recibirá un número decimal correspondiente a la cantidad en euros 
		//y devolverá la cantidad correspondiente en dolares. Escribir el código en el main necesario para probarlo.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dime los euros: ");
		double euros = teclado.nextDouble();
		
		System.out.println(euros + " € son " + aDolares(euros) + " $");

	}
	
	public static double aDolares(double euros){
		final double cotizacion=1.34;
		double dolares = euros * cotizacion;
		return dolares;
				
	}

}
