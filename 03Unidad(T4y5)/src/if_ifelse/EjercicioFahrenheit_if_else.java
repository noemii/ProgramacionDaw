package if_ifelse;

import java.util.Scanner;

public class EjercicioFahrenheit_if_else {

	public static void main(String[] args) {
		
		//1� Leer la temperatura en Fahrenheit
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		
		System.out.println("Dime la temperatura (�F): ");
		
		double temperatura = teclado.nextDouble();
		
		
		//Pasar a �Centigrados
		//Fahrenheit	Celsius	C = (F - 32)/1,8
		temperatura = (temperatura - 32) / 1.8;
		System.out.println("Temperatura: " + temperatura + "�C");
		
		//Si t�<0 imprime aviso de congelacion
		if (temperatura<=0){
			int i;
			
			System.out.println("AVISO: Temperatura de congelacion");
		}else{
			System.out.println("No hay riesgo de congelaci�n");
			
		}

	}
}
