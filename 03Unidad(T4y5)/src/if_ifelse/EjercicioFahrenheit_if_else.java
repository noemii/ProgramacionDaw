package if_ifelse;

import java.util.Scanner;

public class EjercicioFahrenheit_if_else {

	public static void main(String[] args) {
		
		//1º Leer la temperatura en Fahrenheit
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		
		System.out.println("Dime la temperatura (ºF): ");
		
		double temperatura = teclado.nextDouble();
		
		
		//Pasar a ºCentigrados
		//Fahrenheit	Celsius	C = (F - 32)/1,8
		temperatura = (temperatura - 32) / 1.8;
		System.out.println("Temperatura: " + temperatura + "ºC");
		
		//Si tº<0 imprime aviso de congelacion
		if (temperatura<=0){
			int i;
			
			System.out.println("AVISO: Temperatura de congelacion");
		}else{
			System.out.println("No hay riesgo de congelación");
			
		}

	}
}
