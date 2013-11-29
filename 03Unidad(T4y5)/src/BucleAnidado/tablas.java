package BucleAnidado;

import java.util.Scanner;

public class tablas {

	public static void main(String[] args) {
		//Modifica el ejercicio de la tabla de multiplicar de forma que el usuario vaya introduciendo números y se vayan imprimiendo
		//las tablas correspondientes. El programa termina cuando se introduce un número no esté entre 1 y 10

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Tabla del: ");
		
		int numero=0;
		int resultado = 1;
		
		
		do{
			System.out.println("indica un numero");
			numero = teclado.nextInt();
			
			if(numero>10){
				System.out.println("Ese numero no es valido para la tabla de multiplicar");
			}else{
			
			for(int i=0; i<=10; i++){
				
				resultado = numero * i;
				System.out.println(numero + " x " + i + " = " + resultado);
			}
			}
		System.out.println("");
			
		
			
		}while((numero<=10 && numero > 0));
		
	}

}
