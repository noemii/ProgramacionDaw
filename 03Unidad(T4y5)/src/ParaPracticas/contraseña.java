package ParaPracticas;

import java.util.Scanner;

public class contraseña {

	public static void main(String[] args) {
		//2.	Un programa que pida al usuario una contraseña (en el programa escribe la palabra oculta que quieras). 
		//El programa volverá a pedir la contraseña hasta que la adivine el jugador o se llege a los 3 intentos, 
		//lo que ocurra primero. Mostrará un mensaje de aceptación de la contraseña o el de error por hacer tres intentos fallidos.

		Scanner teclado = new Scanner(System.in);
		
		String contraseña="";
		String oculta="hola";
		
		for(int i = 0; i<3; i++){
		System.out.println("Indica la contraseña para continuar");
		contraseña = teclado.nextLine();
		
			if(contraseña.equals(oculta)){
				System.out.println("Contraseña correcta");
				break;
			}
			
		}
	
		if(!contraseña.equals(oculta)){
			System.out.println("Usuario bloqueado");
		}
		

	}

}
