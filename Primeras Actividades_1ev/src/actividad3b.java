import java.util.Scanner;


public class actividad3b {
	//Calculen el per�metro y �rea de un c�rculo dado su radio.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int radio; //declaraci�n de variable entera
		final double PI = Math.PI; //declaraci�n y asignaci�n de valor de PI
		double perimetro, 
				area; //declaraci�n de variables reales
		
		System.out.println(("Introduzca el Radio del circulo (numero positivo"));
		
		radio = teclado.nextInt(); //asignaci�n de lectura de teclado
		
		teclado.close(); //cerramos introduccion de datos de teclado
		
		perimetro = 2 * PI * radio; //asignamos resultado de la operaci�n
		area = PI * radio * radio; //asignamos resultado de la operaci�n
		area = PI * Math.pow(radio, 2); // Radio al cuadrado. OTRA FORMA DE ACERLO
		
		System.out.println( "-----RESULTADOS-----");// imprime cabezera
		System.out.println( "Perimetro " + perimetro); //imprime perimetro
		System.out.println( "area " + area); //imprime area
	}

}
