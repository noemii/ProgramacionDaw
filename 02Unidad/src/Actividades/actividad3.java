package Actividades;
import java.util.Scanner;


public class actividad3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int base,
			altura,	
			perimetro,
			area; //declaraci�n de variables enteras
		
		System.out.println("Introduzca la Base del rectangulo (n�mero positivo)");
		
		base = teclado.nextInt();
		
		System.out.println(( "Introduzca la ALTURA del rect�ngulo ( numero positivo"));
		
		altura = (int) teclado.nextDouble();
		teclado.close();
		
		perimetro = 2 * base + 2 * altura;
		area= base * altura;
		
		System.out.println(( "-----RESULTADOS-----"));
		System.out.println( "Perimetro:" + perimetro + "cm");
		System.out.println("Area:" + area + "cm2");
	}

}
