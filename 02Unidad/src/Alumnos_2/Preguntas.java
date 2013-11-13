package Alumnos_2;

import java.util.Scanner;

public class Preguntas {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
	
		clase alumno1, alumno2, alumno3, edad1;
		alumno1 = new clase();
		alumno2 = new clase();
		alumno3 = new clase();
		

		
		System.out.println("Indica el nombre de 3 alumnos");
		
		preguntarnombre(alumno1);
		preguntarnombre(alumno2);
		preguntarnombre(alumno3);
		
		System.out.println("Indica la edad de uno de los alumnos");
		
		preguntaredad(alumno1);
		//preguntaredad(alumno2);
		//preguntaredad(alumno3);
		
		
		teclado.close();

		System.out.println("LOS DATOS DE LOS ALUMNOS SON ---------");
		System.out.println(alumno1.getNombre() + " " + alumno1.getEdad());
		System.out.println(alumno2.getNombre() + " " + alumno1.getEdad());
		System.out.println(alumno3.getNombre() + " " + alumno1.getEdad());
		
	}
	
	public static void preguntarnombre(clase alumno){
		
		String nombre;
		nombre=teclado.nextLine();
		alumno.setNombre(nombre);
	}
	
	public static void preguntaredad(clase alumno){
		int edad;
		edad=teclado.nextInt();
		alumno.setEdad(edad);
		
	}
	

}
