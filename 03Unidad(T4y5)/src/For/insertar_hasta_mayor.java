package For;

import java.util.Scanner;

public class insertar_hasta_mayor {

	public static void main(String[] args) {
		// Escribe un programa que pida dos n�meros con el fin de visualizar la suma de todos los n�meros que hay entre ambos n�meros 
		//(incluidos dichos n�meros). Si el primer n�mero que inserte el usuario es mayor que el segundo, se volver�n a 
		//pedir otros dos n�meros hasta que el primer n�mero insertado sea menor o igual que el segundo.
		
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int suma = 0;
		
		System.out.println("Indica 1� numero");
		numero1 = teclado.nextInt();
		
		System.out.println("Indica 2� numero");
		numero2 = teclado.nextInt();

		
		while(numero1 > numero2){
			System.out.println("Indica otro primer numero");
			numero1 = teclado.nextInt();
			
			System.out.println("Indica otro segundo numero");
			numero2 = teclado.nextInt();
		}
		
		
		for(numero1=0 ; numero1 <= numero2 ;  numero1++ ){
			
			suma = suma + numero1; 
		}
		System.out.println("resultados: " + suma);
	}

}
