package Actividades;
import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// 5.	Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de datos (Mbps), 
		//y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.
		
		Scanner teclado = new Scanner (System.in);
		
		double MBytes, Mbps;
		
		double velocidad;
		
		System.out.println("Escribe el tama�o de un archivo(Mbytes)");
		
		MBytes = teclado.nextInt() * 8;
		
		System.out.println("Velocidad de la linea de datos (Mbps)");
		
		Mbps = teclado.nextInt();
		
		teclado.close();
		
		
		velocidad = (MBytes / Mbps);
		
		System.out.println("El resultado es: " + velocidad +" segundos");
	}

}
