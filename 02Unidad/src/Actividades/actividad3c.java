package Actividades;
import java.util.Scanner;

public class actividad3c {

	public static void main(String[] args) {
		//	Calculen el volumen de una esfera dado su radio.
		Scanner teclado = new Scanner (System.in);
		
		int radio;
		final double PI = Math.PI; //constante
		double volumen;
		
		System.out.println("Introcir el radio de la esfera (cm)");
		
		radio = teclado.nextInt(); //asignación de lectura de teclado a radio
		
		teclado.close();
		
		volumen = (4 * Math.PI * Math.pow(radio, 3)) / 3;
		//volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio,  3);
		
		System.out.println("-----RESULTADOS-----");
		System.out.println("Volumen " + volumen);
		// para redondear sin decimales    System.out.println("Volumen " + Math.round(volumen*100)/100.0);
		
		
		

	}

}
