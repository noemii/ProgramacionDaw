package if_ifelse;
import java.util.Scanner;
public class DiaSemana_if {

	public static void main(String[] args) {
		//1.	Pide un número del 1 al 7. Imprime el día de la semana equivalente (con letra).
		//HECHO CON IF
		Scanner teclado = new Scanner(System.in);
		int numero_dia;
		String letra_dia = " ";
		
		System.out.println("Dame el dia de la semana (en numero)");
		numero_dia = teclado.nextInt();
		
		if (numero_dia == 1){
			letra_dia = new String ("Lunes");
		}else if(numero_dia == 2){
			letra_dia = "Martes";
		}else if (numero_dia == 3){
			letra_dia = "miercoles";	
		}else if (numero_dia == 4){
			letra_dia = "Jueves";
		}else if ( numero_dia == 5){
			letra_dia = "Viernes";
		}else if (numero_dia == 6){
			letra_dia = "Sabado";
		}else if (numero_dia == 7){
			letra_dia = "Domingo";
		}else {
			System.out.println( "Ese dia no pertenece a la semana");
			letra_dia = "Error";
		}
		if (!letra_dia.equals("Error"))//si la letra del dia no es igual a error
			System.out.println("El dia " + numero_dia + " corresponde al " + letra_dia);
	}
	
	
}
	


