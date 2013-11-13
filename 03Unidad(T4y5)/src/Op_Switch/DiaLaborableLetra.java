package Op_Switch;

import java.util.Scanner;

public class DiaLaborableLetra {

	 	public static void main(String[] args) {
	 		//2.	Pide un número del 1 al 7.
	 		//Imprime si es laborable o festivo. Puedes realizar el ejercicio con sentencias if y otra versión con switch.

	 		String dia;
	 		Scanner teclado = new Scanner(System.in);
	 		
	 		System.out.println("Dame el dia de la semana");
	 		dia = teclado.next();
	 		dia = dia.toLowerCase();//tolowerCase me pasa la cadena a minusculas y asi lo evalua. Yo lo tengo echo para minusculas
	 		
	 		switch (dia){ 
	 		case "lunes":
	 		case "martes":
	 		case "miercoles": 
	 		case "jueves": 
	 		case "viernes":
	 			System.out.println("Dia laborable");
	 			break;
	 		case "sabado":
	 		case "domingo":
	 			System.out.println("Dia festivo");
	 			break;
	 		}
	 		
	 		//if
	 		/*.
	 		 * dia = teclado.nexLine();
	 		 * dia = dia.toLowerCase();
	 		 * if (dia.equals("lunes")) //igual que poner dia == "Lunes";
	 		 * 
	 		 */
	 	}

	 }


