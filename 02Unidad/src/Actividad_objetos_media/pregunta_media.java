package Actividad_objetos_media;

import java.util.Scanner;
public class pregunta_media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nombre1, nombre2, nombre3;
		int edad1,edad2,edad3;
		double media;
		
		mensaje_media texto;
		texto = new mensaje_media();
		texto.nombreu();
		
		nombre1 = teclado.next();
		
		mensaje_media texto2;
		texto2 = new mensaje_media();
		texto2.edad();
		
		edad1 = teclado.nextInt();
		
		texto.nombreu();
		nombre2 = teclado.next();
		
		texto2.edad();
		edad2 = teclado.nextInt();
		
		texto.nombreu();
		nombre3 = teclado.next();
		
		texto2.edad();
		edad3 = teclado.nextInt();
		
		media = ((edad1 + edad2 + edad3)/3.0); // Se divide entre el numero con el .0
		System.out.println("La media de las edades es " + media);
		
		teclado.close();
		

	}

}
