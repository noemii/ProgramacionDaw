package Op_Switch;

 import java.util.Scanner;
 
public class DiaLaborableFestivo {

	public static void main(String[] args) {
		//2.	Pide un número del 1 al 7.
		//Imprime si es laborable o festivo. Puedes realizar el ejercicio con sentencias if y otra versión con switch.

		int numero_dia;
		String letra_dia;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el dia de la semana");
		numero_dia = teclado.nextInt();
		
		switch (numero_dia){
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5:
			System.out.println("Dia laborable");
			break;
		case 6:
		case 7:
			System.out.println("Dia festivo");
			break;
			
		default: letra_dia = "error";
		System.out.println("Error de dia");
		
		}
	}

}
