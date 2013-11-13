package Actividades;

import java.util.Scanner;

public class cuatro {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		float peso = 0.0f; // la "f" que he puesto despues de poner
		final float onzas_por_kilo = 35.2739619f; // define una constante que no se puede modificar
		
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kilogramos;" );
		peso = teclado.nextFloat();
		float onzas = (peso * onzas_por_kilo);
		System.out.println("\n tu peso en Onzas es:" + onzas + " onzas");//(peso * onzas_por_kilo) esto se pone en onzas, si no se define el floa
		
		teclado.close();
	}

}
