package ParaPracticas;

import java.util.Scanner;

public class contrase�a {

	public static void main(String[] args) {
		//2.	Un programa que pida al usuario una contrase�a (en el programa escribe la palabra oculta que quieras). 
		//El programa volver� a pedir la contrase�a hasta que la adivine el jugador o se llege a los 3 intentos, 
		//lo que ocurra primero. Mostrar� un mensaje de aceptaci�n de la contrase�a o el de error por hacer tres intentos fallidos.

		Scanner teclado = new Scanner(System.in);
		
		String contrase�a="";
		String oculta="hola";
		
		for(int i = 0; i<3; i++){
		System.out.println("Indica la contrase�a para continuar");
		contrase�a = teclado.nextLine();
		
			if(contrase�a.equals(oculta)){
				System.out.println("Contrase�a correcta");
				break;
			}
			
		}
	
		if(!contrase�a.equals(oculta)){
			System.out.println("Usuario bloqueado");
		}
		

	}

}
