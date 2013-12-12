package Arrays;

import java.util.Scanner;

public class DatosCliente {

	public static void main(String[] args) {
		//Escribe un programa que pida los datos de empleados, en concreto su nombre y sueldo. Realizará una pregunta tipo "¿Otro [s/n]?" 
		//para saber cuando parar. 
		//El programa calculará la media del sueldo y mostrará el nombre de los empleados que cobran por encima de la media.
	
		Scanner teclado = new Scanner(System.in);
		String nombre="";
		double sueldo;
		String s,n;
		
		do{
			System.out.println("Escribe el nombre del empleado");
			nombre=teclado.nextLine();
			System.out.println("Escribe el sueldo del empleado");
			sueldo=teclado.nextInt();
			
			System.out.println();
			System.out.println("Otro? : [s/n]" );
			s=teclado.nextLine();
			n=teclado.nextLine();
			
			if(n==n) {
				break;
			}
				
			
		}while(s==s);
	
	}

}
