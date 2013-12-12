import java.util.Scanner;


public class actividad3b {
	//Calculen el perímetro y área de un círculo dado su radio.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int radio; //declaración de variable entera
		final double PI = Math.PI; //declaración y asignación de valor de PI
		double perimetro, 
				area; //declaración de variables reales
		
		System.out.println(("Introduzca el Radio del circulo (numero positivo"));
		
		radio = teclado.nextInt(); //asignación de lectura de teclado
		
		teclado.close(); //cerramos introduccion de datos de teclado
		
		perimetro = 2 * PI * radio; //asignamos resultado de la operación
		area = PI * radio * radio; //asignamos resultado de la operación
		area = PI * Math.pow(radio, 2); // Radio al cuadrado. OTRA FORMA DE ACERLO
		
		System.out.println( "-----RESULTADOS-----");// imprime cabezera
		System.out.println( "Perimetro " + perimetro); //imprime perimetro
		System.out.println( "area " + area); //imprime area
	}

}
