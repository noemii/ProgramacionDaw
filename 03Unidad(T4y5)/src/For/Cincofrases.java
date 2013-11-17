package For;

import java.util.Scanner;

public class Cincofrases {

	public static void main(String[] args) {
		// 1.	Escribe un programa que pida cinco frases y las visualice.
		
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador;
		String mostrar = " ";
		
		for(contador = 1 ; contador <=5; contador++ ){
			frase = teclado.nextLine();
			mostrar = mostrar + "\n" + frase + "\n";
		}
		System.out.println("Las frases introducidas son:" + mostrar );
	}

}
