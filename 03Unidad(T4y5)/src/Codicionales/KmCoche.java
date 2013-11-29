package Codicionales;

import java.util.Scanner;

public class KmCoche {

	public static void main(String[] args) {
		//4.	El ordenador de nuestro coche calcula los kilómetros que nos quedan antes de repostar. 
		//Crea un programa que pida: tamaño del depósito (en litros), porcentaje del depósito que está lleno y 
		//litros de consumo por 100kms. El programa mostrará los kilómetros que quedan de autonomía. 
		//Si quedan menos de 30 kilómetros mostrará un aviso de que hay que repostar porque estamos usando la reserva.
		Scanner teclado = new Scanner (System.in);
		
		Double tamañoDeposito;
		Double porcentajeLleno;
		Double consumoKm;
		
		System.out.println("Indica el tamaño del deposito (en litros)");
		tamañoDeposito = teclado.nextDouble();
		
		System.out.println("Indica el porcentaje del deposito que esta lleno");
		porcentajeLleno = teclado.nextDouble();
		
		System.out.println("Indica el consumo a los 100 Kms");
		consumoKm = teclado.nextDouble();
		
		tamañoDeposito = tamañoDeposito;
		
		porcentajeLleno = ((tamañoDeposito * porcentajeLleno) / 100);
		
		consumoKm = (porcentajeLleno * 100) / consumoKm;
				
		if(consumoKm < 30){
			System.out.println("AVISO HAY QUE REPOSTAR QUEDAN: " + consumoKm + " kilometros");
		}else{
			System.out.println("Los kilometros de autonomia son: " + consumoKm + " kilometros");
		}
	}

}
