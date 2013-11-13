package Actividades;
import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// 5.	Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de datos (Mbps), 
		//y muestre el tiempo que tardará en transmitirlo usando dicha línea.
		
		Scanner teclado = new Scanner (System.in);
		
		double MBytes, Mbps;
		
		double velocidad;
		
		System.out.println("Escribe el tamaño de un archivo(Mbytes)");
		
		MBytes = teclado.nextInt() * 8;
		
		System.out.println("Velocidad de la linea de datos (Mbps)");
		
		Mbps = teclado.nextInt();
		
		teclado.close();
		
		
		velocidad = (MBytes / Mbps);
		
		System.out.println("El resultado es: " + velocidad +" segundos");
	}

}
