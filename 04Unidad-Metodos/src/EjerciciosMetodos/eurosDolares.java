package EjerciciosMetodos;

import java.util.Scanner;

public class eurosDolares {

	public static void main(String[] args) {
		//Escribir un método que convierta de euros a dólares. Recibirá un número decimal correspondiente a la cantidad en euros 
		//y devolverá la cantidad correspondiente en dolares. Escribir el código en el main necesario para probarlo.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica los euros");
		double euro = teclado.nextDouble();
		euroDolar(euro);
		
		System.out.println(euroDolar(euro) + "$");
	}

	public static double euroDolar(double euros) {
		
		double dolar = 1.37570;
		double conversion;
		
		conversion = euros * dolar;
		return conversion;
		
	}

}
