package Alumnos2media;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Alumnos_2.clase;

public class preguntas2 {
	private static final JOptionPane JOptionpane = null;
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
		preguntaredad(alumno2);
		preguntaredad(alumno3);
		
		
		teclado.close();

		System.out.println("LOS DATOS DE LOS ALUMNOS SON ---------");
		System.out.println(alumno1.getNombre() + " " + alumno1.getEdad());
		System.out.println(alumno2.getNombre() + " " + alumno2.getEdad());
		System.out.println(alumno3.getNombre() + " " + alumno3.getEdad());
		
		int edadmedia;
		edadmedia = (alumno1.getEdad() + alumno2.getEdad() + alumno3.getEdad())/ 3;
		
		System.out.println("LA MEDIA ES:" + (alumno1.getEdad() + alumno2.getEdad() + alumno3.getEdad())/ 3);
		
		//System.out.println("edad media %f", media);
		//System.out.println("edad Alumno1: %d, Edad alumno2: %d", alumno1.getEdad(),alumno2.getEdad());
		
	}
	
	

	public static void preguntarnombre(clase alumno){
		
		//String nombre;
		//nombre=teclado.nextLine();
		//alumno.setNombre(nombre);
		//JOptionPane.showInputDialog("¿Como se llama el alumno1?");
		
		String nombre;
		nombre=JOptionPane.showInputDialog("Nombre alumno");
		alumno.setNombre(nombre);
	
		
	}
	public static void preguntaredad(clase edadalumno){
		
		//int edad;
		//edad=teclado.nextInt();
		//edadalumno.setEdad(edad);
		
		int edad = 0;
		edad = Integer.parseInt(JOptionpane.showInputDialog ("Digite el valor numerico:"));
		edadalumno.setEdad(edad);
	}
	
	

}
