package For;

import java.util.Scanner;

public class multiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Indica un numero para darte la tabla de multiplicar");
		
		int numero;
		numero = teclado.nextInt();
		//int linea;  //linea es = 1 por que si ponemos 0 nos imprime tambien x11.
		
		
		for (int linea=1; linea<=10; linea++){  //CUIDADO SE SEPARA POR ;
			System.out.println(numero + " x " + linea + " = " + (numero * linea));
		}

	}

}
