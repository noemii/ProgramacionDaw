package actividad_objetos;

import java.util.Scanner;

public class pregunta {

	public static void main(String[] args) {
	
		String nombre1, nombre2, nombre3;
		String Datos, Datos2, Datos3;
		int edad;
		//alumnoclase noemi, pedro, gerardo;
		
		Scanner teclado = new Scanner(System.in);
		
		mensaje texto;
		texto = new mensaje();
		texto.nombreA();
		
		nombre1 = teclado.nextLine();
		nombre2 = teclado.nextLine();
		nombre3 = teclado.nextLine();
		
		mensaje texto2;
		texto2 = new mensaje();
		texto2.edad();
		
		edad = teclado.nextInt();
		
		Datos = nombre1;
		Datos2 = nombre2;
		Datos3 = nombre3;

		
		System.out.println("el resultado general es: \n " + "\n" + (Datos) + " " + (edad) + "\n" + (Datos2) + " " + (edad) + "\n" + (Datos3)+ " " +(edad));

		/*noemi = new alumnoclase("noemi");
		
		pedro = new alumnoclase("pedro");
		
		christian = new alumnoclase("christian");
		
		System.out.println(noemi.nombre);
		
		System.out.println(noemi.edad);*/
		
		
		
	
		
		
				
		
	}

}
