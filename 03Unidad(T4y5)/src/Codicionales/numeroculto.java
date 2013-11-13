package Codicionales;

import java.util.Scanner;

public class numeroculto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int oculto = 7;
		//aleatorio
		//oculto = (int) (Math.random()) * 10 - 1);
		System.out.println("Indica un numero y comprueba si es el oculto");
		
		numero = teclado.nextInt();
		
		while(numero!=oculto){
			System.out.println("Prueba otro numero");
			numero = teclado.nextInt();
			if(numero==oculto){
				System.out.println("Exacto!!! Numero acertado");
			}
		}
		
		
		
		/*int oculto = 7;
		String oculta="siete";
		String leida;
		boolean resultado;
		
		resultado = oculta.equals("siete");
		System.out.println(resultado);// el igual compara referencias que apuntan al mismo objeto para comparar cadena es con un metodo
										//Este codigo devuelve si oculta y leida son iguales
		*/
		
		
	}

}
