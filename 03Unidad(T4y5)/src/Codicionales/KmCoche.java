package Codicionales;

import java.util.Scanner;

public class KmCoche {

	public static void main(String[] args) {
		//4.	El ordenador de nuestro coche calcula los kil�metros que nos quedan antes de repostar. 
		//Crea un programa que pida: tama�o del dep�sito (en litros), porcentaje del dep�sito que est� lleno y 
		//litros de consumo por 100kms. El programa mostrar� los kil�metros que quedan de autonom�a. 
		//Si quedan menos de 30 kil�metros mostrar� un aviso de que hay que repostar porque estamos usando la reserva.
		Scanner teclado = new Scanner (System.in);
		
		Double tama�oDeposito;
		Double porcentajeLleno;
		Double consumoKm;
		
		System.out.println("Indica el tama�o del deposito (en litros)");
		tama�oDeposito = teclado.nextDouble();
		
		System.out.println("Indica el porcentaje del deposito que esta lleno");
		porcentajeLleno = teclado.nextDouble();
		
		System.out.println("Indica el consumo a los 100 Kms");
		consumoKm = teclado.nextDouble();
		
		tama�oDeposito = tama�oDeposito;
		
		porcentajeLleno = ((tama�oDeposito * porcentajeLleno) / 100);
		
		consumoKm = (porcentajeLleno * 100) / consumoKm;
				
		if(consumoKm < 30){
			System.out.println("AVISO HAY QUE REPOSTAR QUEDAN: " + consumoKm + " kilometros");
		}else{
			System.out.println("Los kilometros de autonomia son: " + consumoKm + " kilometros");
		}
	}

}
