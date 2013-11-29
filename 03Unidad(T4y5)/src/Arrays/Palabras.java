package Arrays;

import java.util.Scanner;

public class Palabras {

	public static void main(String[] args) {
		String[] palabras={"uno", "hola", "tera", "bit"};
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame una palabra: " );
		
		String intento = teclado.next();
		boolean encontrado = false;
		
		for(int i=0;i<palabras.length && !encontrado;i++){ //length devuelve 4 por que son las palabras que hay
			if(intento.equals(palabras[i])) encontrado = true;
		}
		
		if(encontrado) System.out.println("Encontrado");
		

	}

}

//#RefraneroInformatico
