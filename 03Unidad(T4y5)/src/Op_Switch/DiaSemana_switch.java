package Op_Switch;

import java.util.Scanner;

public class DiaSemana_switch {
	//1.	Pide un número del 1 al 7. Imprime el día de la semana equivalente (con letra).
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero_dia;
	String letra_dia = " ";
	
	System.out.println("Dame el dia de la semana (en numero)");
	numero_dia = teclado.nextInt();
	
	
	switch (numero_dia){
		case 1:letra_dia = "Lunes";
			break;
		case 2:letra_dia = "Martes";
			break;
		case 3: letra_dia = "Miercoles";
			break;
		case 4: letra_dia = "Jueves";
			break;
		case 5: letra_dia =" Viernes";
			break;
		case 6: letra_dia = "Sabado";
			break;
		case 7: letra_dia ="Domingo";
			break;
		default: letra_dia =" Error";
			System.out.println("El numero no esta entre [1..7]");
			letra_dia = "Error";
			break;
		}
	if (!letra_dia.equals("Error"))//si la letra del dia no es igual a error
		System.out.println("El dia " + numero_dia + " corresponde al " + letra_dia);
	}
}

