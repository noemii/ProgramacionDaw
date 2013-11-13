package Actividades;
import java.util.Scanner;

public class actividad3e {

	public static void main(String[] args) {
		//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa ( h^2=c1^2+c2^2) h= RAIZ DE CATETOS ^2 3+4= 5
		
		Scanner teclado = new Scanner ( System.in);
		
		int c1, c2;
		double hipotenusa;
		
		System.out.println("Escribe el valor del cateto 1");
		
		c1 = teclado.nextInt();
		
		System.out.println("Escribe el valor del cateto 2");
		
		c2 = teclado.nextInt();
		
		
		teclado.close();
		
		hipotenusa = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
		
		System.out.println("La hipotenusa es " + hipotenusa);
	}

}
